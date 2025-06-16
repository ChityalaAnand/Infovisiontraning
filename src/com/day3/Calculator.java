package com.day3;

public class Calculator {
	public int add(int number1, int number2) {
		int result = number1+number2;
		System.out.println("Result is : "+result);
		return result;
	}
	
	public int add(int number1, int number2, int number3) {
		int result = number1+number2+number3;
		System.out.println("Result is : "+result);
		return result;
	}
	
	public float add(float number1, float number2, float number3) {
		float result = number1+number2+number3;
		System.out.println("Result is : "+result);
		return result;
	}

}
