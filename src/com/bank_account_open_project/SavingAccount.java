package com.bank_account_open_project;

class SavingsAccount extends BankAccount {
    private double initialDeposit;

    public SavingsAccount(String customerName, String branchName, String[] documents, double initialDeposit) {
        super(customerName, branchName, documents);
        this.initialDeposit = initialDeposit;
    }

    @Override
    void openAccount() {
        System.out.println(" Opening Savings Account...");
        if (verifyDocuments(this.documents)) {
            if (initialDeposit >= 1000) {
                System.out.println("Savings Account opened successfully.");
            } else {
                System.out.println("Initial deposit too low. Minimum is 1000.");
            }
        } else {
            System.out.println("KYC verification failed. Account cannot be opened.");
        }
    }
}
