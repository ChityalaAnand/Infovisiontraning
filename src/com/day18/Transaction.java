package com.day18;

public class Transaction {
	private String fromAccount;
    private String toAccount;
    private double amount;
 
    public Transaction(String from, String to, double amount) {
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
    }
 
    public void processTransaction() {
        Logger logger = Logger.getInstance(); // Get the single Logger instance
 
        logger.log("Initiating transaction...");
        logger.log("Transferring ₹" + amount + " from " + fromAccount + " to " + toAccount);
        logger.log("Transaction successful.");
    }
}
