package com.kodewala.exceptionhandling;

public class CLArguements {

	public static void main(String[] args) {

		try {

			String s1 = args[0];
			String s2 = args[1];

			System.out.println(s1 + " " + s2);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("Execution terminated");

	}

}
