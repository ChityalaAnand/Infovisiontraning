package com.bankproject_version2;

public class SavingAccount extends BankAccount {
	private static final double INTEREST_RATE = 0.04;
	private int withdrawalCount = 0;

	public SavingAccount(String accountHolderName, long mobileNumber, double initialDeposit) {
		super(accountHolderName, mobileNumber, initialDeposit);
	}

	@Override
	public void openAccount() {
		if (initialDeposit >= 1000) {
			System.out.println("Savings Account opened successfully.");
		} else {
			System.out.println("Minimum deposit of ₹1000 required to open Savings Account.");
		}
	}

	@Override
	public void displayAccountDetails() {
		System.out.println("---- Savings Account ----");
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder: " + getAccountHolderName());
		System.out.println("Mobile Number : " + getMobileNumber());
		System.out.println("Balance       : " + initialDeposit);
	}

	@Override
	public void calculateInterest() {
		double interest = initialDeposit * INTEREST_RATE;
		System.out.println("Interest Earned: " + interest);
	}

	@Override
	public void withdraw(double amount) {
		if (withdrawalCount >= 3) {
			System.out.println("Withdrawal limit exceeded (Max 3 per month).");
		} else if (amount > initialDeposit) {
			System.out.println("Insufficient balance.");
		} else {
			initialDeposit -= amount;
			withdrawalCount++;
			System.out.println(amount + " withdrawn. Remaining balance: " + initialDeposit);
		}
	}

}
