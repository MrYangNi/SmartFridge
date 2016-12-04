package com.jayce.service.def.auth;

import com.jayce.common.auth.token.AuthenticateInfo;
import com.jayce.pojo.auth.StatelessSession;
import org.apache.shiro.authc.AuthenticationException;

/**
 * Created by Jaycejia on 2016/12/4.
 */
public interface SessionService {
    /**
     * 根据用户端唯一标识获得Session对象
     * @param clientId  客户端唯一标识
     * @return session对象
     */
    StatelessSession getSessionByClientId(String clientId);

    /**
     * 判断session是否超时
     * @param session   session对象
     * @return  true为超时，false为未超时
     */
    boolean isExpired(StatelessSession session);

    /**
     * 判断用户是否已经在线
     * @param userId    用户id
     * @return
     */
    boolean userHasLogin(Long userId);

    /**
     * 第一次登录注册session
     * @param session   session对象
     */
    void register(StatelessSession session) throws Exception;

    /**
     * 刷新session活跃时间
     * @param session   session对象
     * @throws Exception
     */
    void refresh(StatelessSession session) throws Exception;

    /**
     * 清除session
     * @param session   session对象
     * @throws AuthenticationException
     */
    void clean(StatelessSession session) throws AuthenticationException;

    /**
     * 生成token，注册并返回
     *
     * @param authcInfo
     * @return
     * @throws Exception
     */
    String registerAccessToken(AuthenticateInfo authcInfo) throws Exception;
}
