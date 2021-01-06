package com.yw.core.exception;

/**
 * @description
 * @author yuanwei
 * @date 2021/1/6 10:23
 */
public class RootException extends RuntimeException {
    protected String code;

    public RootException(String s, String code) {
        super(s);
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
