package com.bankproject_version2;

public abstract class BankAccount{
	private static long accountCounter = 1000000000;
	private long accountNumber;
	private String accountHolderName;
	private long mobileNumber;
	protected double initialDeposit;
	
	public BankAccount(String accountHolderName, long mobileNumber, double initialDeposit) {
        this.accountNumber = accountCounter++;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.initialDeposit = initialDeposit;
    }
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	 public abstract void openAccount();
	 public abstract void displayAccountDetails();
	 public abstract void calculateInterest();
	 public abstract void withdraw(double amount);
}