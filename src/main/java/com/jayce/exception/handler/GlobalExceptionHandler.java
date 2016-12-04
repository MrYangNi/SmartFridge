package com.jayce.exception.handler;

import com.jayce.common.pojo.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Jaycejia on 2016/12/3.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorInfo resolveException(Exception e) {
        return new ErrorInfo(ErrorInfo.ERROR_CODE_UNKOWN, "未知错误", e);
    }
}
