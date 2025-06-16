package com.bankproject_version2;

public class CurrentAccount extends BankAccount {
    private static final double MIN_BALANCE = 2000;
    private static final double PENALTY = 500;

    public CurrentAccount(String accountHolderName, long mobileNumber, double initialDeposit) {
		super(accountHolderName, mobileNumber, initialDeposit);
	}
    @Override
    public void openAccount() {
        if (initialDeposit >= 5000) {
            System.out.println("Current Account opened successfully.");
        } else {
            System.out.println("Minimum deposit of ₹5000 required to open Current Account.");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("---- Current Account ----");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Balance       : " + initialDeposit);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest provided for Current Accounts.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > initialDeposit) {
            System.out.println("Insufficient balance.");
        } else {
        	initialDeposit -= amount;
            if (initialDeposit < MIN_BALANCE) {
            	initialDeposit -= PENALTY;
                System.out.println(amount + " withdrawn. ₹500 penalty charged due to low balance.");
            } else {
                System.out.println(amount + " withdrawn.");
            }
            System.out.println("Remaining balance: " + initialDeposit);
        }
    }
}

