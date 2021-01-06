package com.yw.core.exception;


import org.springframework.http.HttpStatus;

/**
 * feign exception.
 */
public class FeignParameterException extends RootException {


    private static final long serialVersionUID = 4481154635611644256L;

    public FeignParameterException(final String s) {
        super(s, String.valueOf(HttpStatus.BAD_REQUEST.value()));
    }

    public FeignParameterException(final String s, final String code) {
        super(s, code);
    }

}
