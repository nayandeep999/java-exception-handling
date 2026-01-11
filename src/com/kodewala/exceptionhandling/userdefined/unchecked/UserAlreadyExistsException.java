package com.kodewala.exceptionhandling.userdefined.unchecked;

public class UserAlreadyExistsException extends RuntimeException {
	public UserAlreadyExistsException(String message) {
		super(message);
	}
}
