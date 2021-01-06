
package com.yw.core.exception;


import org.springframework.http.HttpStatus;


/**
 * DAO exception.
 */
public class DAOException extends RootException {


    private static final long serialVersionUID = -850089906632635574L;

    public DAOException(final String s) {
        super(s, String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    public DAOException(final String s, final String code) {
        super(s, code);
    }
}
