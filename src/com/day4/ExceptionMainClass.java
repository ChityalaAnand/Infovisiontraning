package com.day4;

import java.util.Scanner;

public class ExceptionMainClass{
	public static void main(String[] args) throws UserDefinedException{
		int requiredAgeForVoting = 18;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enetr your age! ");
		int age = scanner.nextInt();	
		if(age <= requiredAgeForVoting) {
			throw new UserDefinedException("You are not eligible for voting because your age is less than "+ requiredAgeForVoting);
		}
	}
}
