package com.namelessmc.java_api.exception;
public class CannotSendEmailException extends ApiErrorException {
	private static final long serialVersionUID = 1L;
	public CannotSendEmailException() {
		super(ApiError.UNABLE_TO_SEND_REGISTRATION_EMAIL);
	}
}
