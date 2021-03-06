package com.jayce.common.auth.exception;

import com.jayce.common.exception.CustomizedException;
import org.apache.shiro.authc.AuthenticationException;

/**
 * Created by Jayce on 2016/10/10.
 */
public class LogOutException extends AuthenticationException implements CustomizedException {
    public LogOutException() {
        super("注销失败");
    }

    public LogOutException(String message) {
        super(message);
    }
}
