package com.kodewala.exceptionhandling;

public class CheckedVsUncheckedExcp {
	public static void main(String[] args) {
		String s1 = null;
		try {
			s1.length(); // Unchecked exception -> compiler does not throw any error
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			// Compiler forces you to handle checked exceptions
			Class.forName("com.kodewala.exceptionhandling.test"); // Un-handled exception type ClassNotFoundException
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
