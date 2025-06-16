package com.bank_account_open_project;

public class BankingApp {
	public static void main(String[] args) {
        String branch = "Main Branch";
        String customer = "Chityala Anand";
        String[] validDocs = {"ID Proof", "Address Proof", "PAN Card"};
        
        BankAccount savings = new SavingsAccount(customer, branch, validDocs, 1500);
        BankAccount current = new CurrentAccount(customer, branch, validDocs, "Restarent");

        BankAccount[] accounts = {savings, current};

        for (BankAccount acc : accounts) {
            acc.displayCustomerDetails();
            acc.openAccount();
        }
    }
}
