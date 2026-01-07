package com.kodewala.exceptionhandling.interview;

public class ThrowsVsThrow {

	public static void m1() throws RuntimeException, Exception { // not handled but compiler satisfied , but those who
																	// will call m1 should handle that
		m2(); // since m2 throws checked exception compiler forces you to handle that
	}

	public static void m2() throws Exception {
		throw new RuntimeException("m2 throws runtime exception");
	}

	public static void main(String[] args) {

		try {
			m1(); // Since m1 throws checked exception -> Exception, we must handle this
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
