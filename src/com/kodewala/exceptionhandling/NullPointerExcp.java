package com.kodewala.exceptionhandling;

public class NullPointerExcp {

	public static void main(String[] args) {
		String s1 = "java";
		s1 = null;
		int length = s1.length(); // Null pointer exception in line number 8
		System.out.println(length);
		System.out.println("Finished Execution"); // This will not execute
	}

}
