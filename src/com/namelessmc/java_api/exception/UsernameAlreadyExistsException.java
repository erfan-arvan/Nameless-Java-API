package com.namelessmc.java_api.exception;
import javax.annotation.Nullable;
import com.namelessmc.java_api.ApiError;

public class UsernameAlreadyExistsException extends ApiErrorException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyExistsException() {
        super(ApiError.USERNAME_ALREADY_EXISTS);
    }
}
