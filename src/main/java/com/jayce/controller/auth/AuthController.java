package com.jayce.controller.auth;

import com.jayce.common.auth.token.AuthenticateInfo;
import com.jayce.common.auth.token.StatelessToken;
import com.jayce.exception.auth.UserHasLogoutException;
import com.jayce.pojo.auth.LoginInfoRsp;
import com.jayce.pojo.auth.StatelessSession;
import com.jayce.pojo.user.SimpleUser;
import com.jayce.service.def.auth.SessionService;
import com.jayce.service.def.user.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Jaycejia on 2016/12/4.
 */
@RestController
public class AuthController {
    @Autowired
    private SessionService sessionService;
    /**
     * 用于处理登录的controller
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json")
    public LoginInfoRsp generateToken(HttpServletRequest request) throws Exception{
        Subject subject = SecurityUtils.getSubject();
        SimpleUser simpleUser = (SimpleUser) subject.getPrincipal();
        LoginInfoRsp loginInfoRsp = new LoginInfoRsp(simpleUser);
        AuthenticateInfo authcInfo = (AuthenticateInfo) request.getAttribute("authcInfo");
        loginInfoRsp.setAuthToken(sessionService.registerAccessToken(authcInfo));
        return loginInfoRsp;
    }


    /**
     * 用于用户注销
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void logout(HttpServletRequest request) throws Exception{
        String authMessage = request.getHeader(HttpHeaders.AUTHORIZATION);
        StatelessToken token = new StatelessToken();
        if (authMessage.matches("^Basic \\S+:\\S+$")) {
            token.setClientId(authMessage.replace("Basic ", "").split(":")[0]);
            token.setAccessTokenString(authMessage.replace("Basic ", "").split(":")[1]);
        }
        StatelessSession session = sessionService.getSessionByClientId((String) token.getPrincipal());
        if (session == null) {
            throw new UserHasLogoutException();
        }
        sessionService.clean(session);
    }
}
