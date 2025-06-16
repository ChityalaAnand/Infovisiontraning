package com.day3;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.add(5, 10);
		cc.add(20, 30, 40);
		cc.add(10.50f, 50.50f, 30.00f);
	}
}
