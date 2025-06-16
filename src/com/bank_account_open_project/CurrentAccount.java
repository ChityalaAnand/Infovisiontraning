package com.bank_account_open_project;

class CurrentAccount extends BankAccount {
    private String businessName;

    public CurrentAccount(String customerName, String branchName, String[] documents, String businessName) {
        super(customerName, branchName, documents);
        this.businessName = businessName;
    }

    @Override
    void openAccount() {
        System.out.println(" Opening Current Account...");
        if (verifyDocuments(this.documents)) {
            if (businessName != null && !businessName.isEmpty()) {
                System.out.println("Current Account opened successfully for business: " + businessName);
            } else {
                System.out.println("Business name is required for Current Account.");
            }
        } else {
            System.out.println("KYC verification failed. Account cannot be opened.");
        }
    }
}
