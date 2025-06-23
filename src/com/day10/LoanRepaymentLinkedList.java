package com.day10;

import java.util.*;

public class LoanRepaymentLinkedList {
	public static void main(String[] args) {
		LinkedList<String> payments = new LinkedList<>();

		payments.add("Payment 1: 5000 on 2025-01-10");
		payments.add("Payment 2: 5000 on 2025-02-10");
		payments.add("Payment 3: 5000 on 2025-03-10");

		System.out.println(" Loan Repayment History: ");
		for (String payment : payments) {
			System.out.println(payment);
		}
		System.out.println("-----------------------------------");
		payments.remove(0);
		System.out.println("After removing the first payment:");
		for (String payment : payments) {
			System.out.println(payment);
		}
		System.out.println("-----------------------------------");
		payments.addFirst("Payment 1: 5500 on 2025-01-10");
		for (String payment : payments) {
			System.out.println(payment);
		}
		System.out.println("-----------------------------------");
		payments.addLast("Payment 4: 5000 on 2025-04-10");
		for (String payment : payments) {
			System.out.println(payment);
		}

	}
}
