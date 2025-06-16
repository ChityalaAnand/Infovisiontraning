package com.day4.multithreading;

public class Account {
	private int balance = 10000;
	
	public synchronized void withdraw(String user, int amount) {
		System.out.println(user + " is trying to withdraw "+ amount);
		if(balance >= amount) {
			System.out.println("Sufficient balance available for "+ user);
			balance -= amount;
			System.out.println("Withdrawal successful for "+user+" Remainng balance "+balance);
		}else {
			System.out.println("Insufficient funds for "+user+" Current balance "+balance);
		}
	}
}
