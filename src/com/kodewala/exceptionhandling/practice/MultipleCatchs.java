package com.kodewala.exceptionhandling.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MultipleCatchs {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("teso.txt");
			FileOutputStream fo = new FileOutputStream("testo.txt");
		} catch (FileNotFoundException | RuntimeException e) {
			if (e instanceof FileNotFoundException) {
				System.out.println(e.getMessage());
			} else {
				System.out.println(e.getMessage());
			}
		}
	}

}
