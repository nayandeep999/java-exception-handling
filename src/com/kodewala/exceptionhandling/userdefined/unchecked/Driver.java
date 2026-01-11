package com.kodewala.exceptionhandling.userdefined.unchecked;

public class Driver {

	public static void main(String[] args) {
		Register r = new Register();
		try {
			r.register("java");
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}

		System.out.println("Execution finished");
	}

}
