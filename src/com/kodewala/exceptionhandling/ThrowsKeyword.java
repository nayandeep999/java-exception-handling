package com.kodewala.exceptionhandling;

public class ThrowsKeyword {

	public static void createArrray(int index, int... num) throws ArrayIndexOutOfBoundsException {
		// This function may throw ArrayIndexOutOfBoundsException and the caller handles
		// it
		// The compiler does not force you to use this function inside try-catch block
		// Because its a Runtime Exception
		// Its for testers to check the function
		int arr[] = num;
		System.out.println(arr[index]);

	}

	public static void main(String[] args) {
		try {
			createArrray(5, 22, 11, 27, 39);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			createArrray(3, 33, 91, 22, 37);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
