package com.kodewala.exceptionhandling;

public class ThrowKeyword {

	public static double divideNumbers(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Parameter 'b' must not be zero"); // When throwing a custom exception you
																				// should define a message
		}
		return a / b;
	}

	public static void main(String[] args) {

		// System.out.println(divideNumbers(10, 0)); // Must use try catch block to
		// catch the exception

		try {
			System.out.println(divideNumbers(10, 0));

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Execution completed");
	}

}
