package com.kodewala.exceptionhandling.practice;

public class ReThrowExceptions {

	public static void internalError() throws Exception {
		try {
			int c = 10 / 0;
		} catch (ArithmeticException e) {
			// System.out.println(e);
			throw new Exception("Internal Error");
		}
	}

	public static void main(String[] args) {
		try {
			internalError();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
