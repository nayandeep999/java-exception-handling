package com.kodewala.exceptionhandling;

public class ExceptionSequence {

	public static void main(String[] args) {
		String s1 = "hello";
		int arr[] = { 77 };

		try {

			s1.length();
			int res = arr[0];
			int c = 10 / 0;

		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) { // Anything that we have not catch Exception will catch that
			System.out.println(e);

		} // catch(NullPointerException e) { // Unreachable catch block for
			// NullPointerException. It is already handled by the catch block for Exception

		// }

		System.out.println("Execution finished");
	}

}
