package com.yw.core.exception;


import org.springframework.http.HttpStatus;

/**
 * feign exception.
 */
public class FeignException extends RootException {


    private static final long serialVersionUID = -3142204202690778316L;

    public FeignException(final String s) {
        super(s, String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    public FeignException(final String s, final String code) {
        super(s, code);
    }

}
