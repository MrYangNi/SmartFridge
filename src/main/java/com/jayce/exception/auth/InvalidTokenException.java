package com.jayce.exception.auth;

import com.jayce.exception.CustomizedException;
import org.apache.shiro.authc.AuthenticationException;

/**
 * Created by Jayce on 2016/9/29.
 */
public class InvalidTokenException extends AuthenticationException implements CustomizedException{
    public InvalidTokenException() {
        super("token无效");
    }
}