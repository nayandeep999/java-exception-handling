package com.kodewala.exceptionhandling;

class UserAlreadyExists extends Exception {
	UserAlreadyExists(String message) {
		super(message);
	}
}

public class UserDefinedExcp {

	public static void main(String[] args) {

		String user = "Nayandeep";
		try {
			if (user.equalsIgnoreCase("Nayandeep")) {
				throw new UserAlreadyExists("Error: User already exists in the system");
			}
		} catch (UserAlreadyExists e) {
			System.out.println(e.getMessage());
		}
	}

}
