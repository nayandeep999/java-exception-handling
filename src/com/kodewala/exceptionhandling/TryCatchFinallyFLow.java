package com.kodewala.exceptionhandling;

class OverridingReturnInFinalBlock {

	public static int returnInt() {
		try {
			System.out.println("DB Connection Opened");
			return 100;

		} catch (Exception e) {
			System.out.println(e);
			try {

			} catch (Exception e2) {
				System.out.println(e2);
			}

		} finally {
			try {
				System.out.println("DB Connectioned closed");
			} catch (Exception e) {
				System.out.println(e);
			}
			return 200; // this will overwrite the return 100;
			// Always returns 200, no matter what. -> NOT GOOD PRACTICE
			// A finally block is supposed to run cleanup code
			// Closing db connections, file connections
			// INTERVIEW QUESTION
		}
	}

}

public class TryCatchFinallyFLow {

	public static void main(String[] args) {

		int res = OverridingReturnInFinalBlock.returnInt();
		System.out.println(res); // 200

	}

}
