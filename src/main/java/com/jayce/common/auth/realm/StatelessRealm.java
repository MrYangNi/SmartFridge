package com.jayce.common.auth.realm;


import com.jayce.common.auth.SerializableByteSource;
import com.jayce.common.auth.token.AuthenticateInfo;
import com.jayce.common.auth.token.StatelessToken;
import com.jayce.pojo.auth.StatelessSession;
import com.jayce.pojo.user.SimpleUser;
import com.jayce.service.def.auth.SessionService;
import com.jayce.service.def.user.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jayce on 2016/9/21.
 * 认证、授权realm
 */
public class StatelessRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Autowired
    SessionService sessionService;
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof StatelessToken || token instanceof AuthenticateInfo;
    }

    //认证方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        if (token instanceof StatelessToken) {
            StatelessToken statelessToken = (StatelessToken) token;//认证token
            String clientIdFromUser = (String) statelessToken.getPrincipal();
            StatelessSession session = sessionService.getSessionByClientId(clientIdFromUser);
            return new SimpleAuthenticationInfo(session.getClientId(), session.getToken(), getName());
        } else {
            AuthenticateInfo authenticateInfo = (AuthenticateInfo) token;//认证信息
            String principal = (String) authenticateInfo.getPrincipal();//1.用户名
            SimpleUser user = userService.getUserByName(principal);//2.根据用户名获取user信息（正确的）
            if (user == null) {//如果获取结果则说明无此用户，返回null，抛出UnknownAccountException异常
                return null;
            }
            return new SimpleAuthenticationInfo(user, user.getPassword(), new SerializableByteSource(user.getSalt().getBytes()), getName());
        }

    }

    //授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //根据用户名查找权限，请根据需求实现
        StatelessSession session = sessionService.getSessionByClientId((String) principals.getPrimaryPrincipal());
        List<String> permissionList = null;
        SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(permissionList);
        return authorizationInfo;
    }

    @Override
    public void doClearCache(PrincipalCollection principals) {
        super.doClearCache(principals);
    }
}