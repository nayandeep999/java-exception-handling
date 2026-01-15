package com.kodewala.exceptionhandling.practice;

public class CustomCheckedVsUncheckedEx {

	public static void m1() throws CustomCheckedExceptions {
		throw new CustomCheckedExceptions("m1: custom checked exception");
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (CustomCheckedExceptions e) {
			e.printStackTrace();
		}
	}

}
