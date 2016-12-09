package com.jayce.common.pojo;

/**
 * Created by Jaycejia on 2016/12/4.
 */
public class ErrorInfo {
    public static final int ERROR_CODE_UNKNOWN = -1;
    public static final int ERROR_CODE_AUTHENTICATION = -2;
    public static final int ERROR_CODE_DAO = -2;
    private int errorCode;
    private String errorMessage;
    private String exceptionName;
    private StackTraceElement[] exceptionStackTrace;

    public ErrorInfo() {
    }

    public ErrorInfo(int errorCode, String errorMessage, Exception exp) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.exceptionName = exp.getClass().getName();
        this.exceptionStackTrace = exp.getStackTrace();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public StackTraceElement[] getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    public void setExceptionStackTrace(StackTraceElement[] exceptionStackTrace) {
        this.exceptionStackTrace = exceptionStackTrace;
    }
}
