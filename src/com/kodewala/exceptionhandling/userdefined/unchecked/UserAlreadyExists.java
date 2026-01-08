package com.kodewala.exceptionhandling.userdefined.unchecked;

public class UserAlreadyExists extends RuntimeException {
	public UserAlreadyExists(String message) {
		super(message);
	}
}
