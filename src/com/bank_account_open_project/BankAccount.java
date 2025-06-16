package com.bank_account_open_project;

abstract class BankAccount implements KYCVerification {
    String customerName;
    String branchName;
    String[] documents;

    public BankAccount(String customerName, String branchName, String[] documents) {
        this.customerName = customerName;
        this.branchName = branchName;
        this.documents = documents;
    }

    abstract void openAccount();

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName + " Branch Name: " + branchName);

    }

    public boolean verifyDocuments(String[] documents) {
        String[] requiredDocs = {"ID Proof", "Address Proof", "PAN Card"};
        int matchCount = 0;
        
        for (String required : requiredDocs) {
            for (String doc : documents) {
                if (doc.equalsIgnoreCase(required)) {
                    matchCount++;
                    break;
                }
            }
        }
        return matchCount == requiredDocs.length;
    }
}
