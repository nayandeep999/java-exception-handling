package com.kodewala.exceptionhandling;

public class NormalVsCriticalCode {

	public static void main(String[] args) {

		int a = 10; // Normal Code
		int b = 11; // Normal Code

		// int c = (a + b) / 0; // Critical Code -> immediately program crashes at this
		// line & execution stops

		int c = 0;

		try {

			c = (a + b) / 0;

		} catch (Exception e) {
			System.out.println(e); // does not stops execution
		}

		System.out.println("The value of c is: " + c);

		System.out.println("Bye"); // runs

	}

}
