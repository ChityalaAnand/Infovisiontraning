package com.day15;

import java.util.Scanner;

public class EmailValidationEcommerceApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Email to Login");
		String email = scanner.next();
		validateEmail(email);
	}
	public static void validateEmail(String email) {
		if(email.length() < 5) {
			System.out.println("please enter correct email");
		}else if(email.trim().toLowerCase().contains("@.com")) {
			System.out.println("Successfully validated email");
		}else {
			System.out.println("please enter the valid email");
		}
	}
}
