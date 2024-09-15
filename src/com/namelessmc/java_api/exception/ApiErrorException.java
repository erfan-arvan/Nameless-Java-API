package com.namelessmc.java_api.exception;
import javax.annotation.Nullable;
public class ApiErrorException extends Exception {

    private static final long serialVersionUID = 1L;

    public ApiErrorException(final int code) {
        super("API error code " + code);
    }
}
