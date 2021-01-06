
package com.yw.core.exception;



import org.springframework.http.HttpStatus;

/**
 * Parameter exception.
 */
public class ParameterException extends RootException {


    private static final long serialVersionUID = 1315010529009246576L;

    public ParameterException(final String s) {
        super(s, String.valueOf(HttpStatus.BAD_REQUEST.value()));
    }

    public ParameterException(final String s, final String code) {
        super(s, code);
    }
}
