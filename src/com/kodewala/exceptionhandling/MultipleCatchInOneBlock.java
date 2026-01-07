package com.kodewala.exceptionhandling;

public class MultipleCatchInOneBlock {

	public static void main(String[] args) {
		try {

			String s1 = null;
			s1.length();

			Class.forName("kjdjkdjksdjksdj"); // you must throw checked exceptions to catch it because compiler knows

		} catch (NullPointerException | ClassNotFoundException | ArrayIndexOutOfBoundsException e) {
			// Introduced in java 8 -> exceptions should be un-releated (Either subclass or
			// superclass should be catch-ed)
			// NullPointerException | ClassNotFoundException |
			// ArrayIndexOutOfBoundsException | RuntimeException e
			// The exception ArrayIndexOutOfBoundsException is already caught by the
			// alternative RuntimeException
			System.out.println(e);
		}
	}

}
