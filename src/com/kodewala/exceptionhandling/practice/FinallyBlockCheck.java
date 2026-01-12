package com.kodewala.exceptionhandling.practice;

public class FinallyBlockCheck {

	public static int throwsException() throws ArithmeticException {
		try {
			int res = 10 / 0;
		} finally {
			System.out.println("throwsException(): Finally executed"); // finally block will run first then exception
																		// thrown
		}
		return 0;
	}

	public static void main(String[] args) {

		try {
			throwsException();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Execution finished");
	}

}
