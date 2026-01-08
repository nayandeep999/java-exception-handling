package com.kodewala.exceptionhandling.interview;

public class TryFinallyReturn {

	public static int returingInt() {
		try {
			return 100;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Return 100 ke bad bhi chal raha h");
		}

		System.out.println("Ye print nahi hoga due to early return");

		return 50;
	}

	public static void main(String[] args) {
		System.out.println(returingInt());
	}

}
