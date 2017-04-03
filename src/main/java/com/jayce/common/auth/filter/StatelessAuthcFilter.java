package com.jayce.common.auth.filter;


import com.jayce.common.auth.pojo.StatelessSession;
import com.jayce.common.auth.service.def.SessionService;
import com.jayce.common.auth.token.StatelessToken;
import com.jayce.common.auth.exception.InvalidTokenException;
import com.jayce.common.auth.exception.NoAuthenticatedInfoException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Jayce on 2016/9/21.
 * 身份认证过滤器
 */
public class StatelessAuthcFilter extends AccessControlFilter {
    private Logger logger = LoggerFactory.getLogger(StatelessAuthcFilter.class);
    @Autowired
    private SessionService sessionService;

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        //1、根据客户端认证信息生成无状态Token
        String requestMessage = httpServletRequest.getHeader(HttpHeaders.AUTHORIZATION);
        try {
            StatelessToken token = checkToken(requestMessage);
            StatelessSession session = sessionService.getSessionByClientId((String) token.getPrincipal());
            request.setAttribute("userId", session.getUserId());
        } catch (Exception e) {
            onAuthcFail(request, e);
        } finally {
            return true;
        }
    }

    private void onAuthcFail(ServletRequest request, Exception exp) {
        if (logger.isTraceEnabled()) {
            logger.trace(exp.getMessage(), exp);
        }
        Exception e;
        if (exp instanceof IncorrectCredentialsException) {
            e = new InvalidTokenException(exp);
        } else {
            e = exp;
        }
        request.setAttribute("shiroLoginFailure", e);
    }

    public StatelessToken checkToken(String requestMessage) {
        StatelessToken token = new StatelessToken();
        if (requestMessage == null || "".equals(requestMessage)) {
            throw new NoAuthenticatedInfoException();//无认证，登录失败
        } else if (!requestMessage.matches("^Basic \\S+:\\S+$")) {
            throw new InvalidTokenException();
        } else {
            String clientId = requestMessage.replace("Basic ", "").split(":")[0];
            String tokenString = requestMessage.replace("Basic ", "").split(":")[1];
            token.setClientId(clientId);
            token.setAccessTokenString(tokenString);
            //委托认证
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
        }
        return token;
    }
}