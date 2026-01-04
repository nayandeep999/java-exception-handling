package com.kodewala.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordCheckedExcp {

	public static void readFile() throws IOException { // Checked Exception
		FileReader fr = new FileReader("test.txt");
	}

	public static void main(String[] args) {
		// You must add throws IOException that calls readFile()
		// public static void main(String[] args) throws IOException {}
		// or must use try-catch block
		try {
			readFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("hello");
	}

}
