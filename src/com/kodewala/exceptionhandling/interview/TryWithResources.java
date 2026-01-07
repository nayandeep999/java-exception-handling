package com.kodewala.exceptionhandling.interview;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); FileInputStream fl = new FileInputStream("hi.txt")) {
			// try with resources, Class should be auto closable then only we can use that
			// class -> Scanner & FileInputStream both implements Closable interface
			// Introduced in java 8
			sc.next();

		} catch (Exception e) {
			System.out.println(e);
		}
		// under the hood uses finally block to close the connections
		// sc.close(); fl.close();

	}

}
