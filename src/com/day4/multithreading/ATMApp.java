package com.day4.multithreading;

public class ATMApp {
	public static void main(String[] args) {
		Account account = new Account();
		Thread user1 = new Thread(new ATM(account, "Anand", 5000));
		
		Thread user2 = new Thread(new ATM(account, "kranthi", 2000));
		
		Thread user3 = new Thread(new ATM(account, "manoj", 3000));
		
		user1.start();
		user2.start();
		user3.start();
	}
}
