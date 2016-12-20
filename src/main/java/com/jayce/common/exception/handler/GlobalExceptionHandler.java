package com.jayce.common.exception.handler;

import com.jayce.common.pojo.ErrorInfo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Jaycejia on 2016/12/3.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理用户未找到的回应
     * HTTP状态码：403 FORBIDDEN
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(UnknownAccountException.class)
    public ErrorInfo resolveUnknownAccount(UnknownAccountException e) {
        return new ErrorInfo(ErrorInfo.ERROR_CODE_AUTHENTICATION, "找不到该用户", e);
    }
    /**
     * 处理未知错误
     * HTTP状态码：500 INTERNAL_SERVER_ERROR
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorInfo resolveUnknownException(Exception e) {
        return new ErrorInfo(ErrorInfo.ERROR_CODE_UNKNOWN, "未知错误", e);
    }
    /**
     * 处理mybatis内部异常
     * HTTP状态码：500 INTERNAL_SERVER_ERROR
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(MyBatisSystemException.class)
    public ErrorInfo resolveMybatisException(MyBatisSystemException e) {
        return new ErrorInfo(ErrorInfo.ERROR_CODE_DAO, "数据库操作错误", e);
    }


}
