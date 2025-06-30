package com.day16;

public interface IntrestCalculator {
	default double calculateInterest(double balance, double rate) {
		return balance * rate / 100;
	}

	static double yearlyInterest(double balance, double rate) {
		return balance * Math.pow(1 + rate / 100, 1) - balance;
	}
}
