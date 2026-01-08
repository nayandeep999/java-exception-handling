package com.kodewala.exceptionhandling.userdefined.checked;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
