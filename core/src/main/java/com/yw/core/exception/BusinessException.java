package com.yw.core.exception;


import org.springframework.http.HttpStatus;

/**
 * business exception.
 */
public class BusinessException extends RootException {


    private static final long serialVersionUID = -7629337435718088956L;

    public BusinessException(final String s) {
        super(s, String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    public BusinessException(final String s, final String code) {
        super(s, code);
    }
}
