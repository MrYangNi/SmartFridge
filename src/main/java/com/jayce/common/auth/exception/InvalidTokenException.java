package com.jayce.common.auth.exception;

import com.jayce.common.exception.CustomizedException;
import org.apache.shiro.authc.AuthenticationException;

/**
 * Created by Jayce on 2016/9/29.
 */
public class InvalidTokenException extends AuthenticationException implements CustomizedException{
    public InvalidTokenException() {
        super("token无效");
    }
}
