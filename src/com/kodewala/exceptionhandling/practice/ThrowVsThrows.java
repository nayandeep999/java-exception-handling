package com.kodewala.exceptionhandling.practice;

class IwillNotHandleError {
	public static void uselessMethod() throws RuntimeException {
		throw new ArrayIndexOutOfBoundsException("uselessMethod() throws this");
	}

	public static void callsUselessMethod() throws RuntimeException {
		uselessMethod(); // we are not handling the exception this method throws
		// we use throws so the caller who calls callsUselessMethod()
		// must handle this
	}
}

public class ThrowVsThrows {
	public static void main(String[] args) {
		try {
			IwillNotHandleError.callsUselessMethod();
		} catch (RuntimeException e) {
			System.out.println(e);
			// e.printStackTrace();
		}
	}
}
