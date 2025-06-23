package com.day10;
import java.util.*;
public class LinkedListRetainedAllMethod {
	public static void main(String[] args) {
		LinkedList<String> phonePay = new LinkedList<>();
		phonePay.add("First Payment Completed");
		phonePay.add("Second Payment Completed");
		phonePay.add("Third1 Payment Completed");
		phonePay.add("Fourth Payment Completed");
		
		LinkedList<String> googlePay = new LinkedList<>();
		googlePay.add("First Payment Completed");
		googlePay.add("Second Payment Completed");
		googlePay.add("Third Payment Completed");
		googlePay.add("Fourth Payment Completed");
		
		phonePay.retainAll(googlePay);
		
		System.out.println(phonePay);
		
		
	}
}
