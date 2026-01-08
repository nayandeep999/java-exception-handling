package com.kodewala.exceptionhandling.userdefined.unchecked;

public class Register {

	String email = "java";

	public void register(String _email) throws UserAlreadyExists {
		if (email.equals(_email)) {
			throw new UserAlreadyExists("User already exists");
		} else {
			System.out.println("Registration succesful");
		}
	}

}
