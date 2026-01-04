package com.kodewala.exceptionhandling;

public class MultipleCatchs {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		int c;
		int arr[] = { 5, 8, 2, 1 };

		try {

			c = a / b; // As soon as this line executes it throws exception & control goes to catch
			System.out.println(arr[5]); // this will not execute

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			c = 10 / 10;
			System.out.println(arr[5]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Collapsing catch exceptions
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		/*- 
		 * try {
			c = 10 / 10;
			System.out.println(arr[5]);
		} catch (Exception e) { -> YOU CANT DO THIS BECAUSE COMPILER CHECKS IF EXCEPTIONS MATCHES THIS EXCEPTION
			THEN IT DOES NOT CHECK ANY OTHER CATCH BLOCKS BECAUSE IT HAPPENS DURING RUNTIME (TOP TO BOTTOM EXECUTION)
			System.out.println(e.getMessage());
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Collapsing catch exceptions
			System.out.println(e.getMessage());
		}
		 * */
	}

}
