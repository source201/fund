package com.yw.core.exception;

import org.springframework.http.HttpStatus;

/**
 * @description
 * @author yuanwei
 * @date 2021/1/6 10:22
 */
public class SystemException extends RootException {


    private static final long serialVersionUID = -7673090061991509657L;

    public SystemException(final String s) {
        super(s, String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    public SystemException(final String s, final String code) {
        super(s, code);
    }
}
