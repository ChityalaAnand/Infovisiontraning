package com.day18;

public class BillingSystem {
	private static BillingSystem instance;
    private final LoggerBilling logger;
    private double totalAmount;

    private BillingSystem() {
        logger = LoggerBilling.getInstance();
        totalAmount = 0.0;
        logger.log("BillingSystem initialized.");
    }

    public static BillingSystem getInstance() {
        if (instance == null) {
            synchronized (BillingSystem.class) {
                if (instance == null)
                    instance = new BillingSystem();
            }
        }
        return instance;
    }

    public void addCallCharge(int minutes) {
        double charge = minutes * 1.0;
        totalAmount += charge;
        logger.log("Call charge added: " + charge);
    }

    public void addSMSCharge(int count) {
        double charge = count * 0.5;
        totalAmount += charge;
        logger.log("SMS charge added: " + charge);
    }

    public void printBill() {
        logger.log("Total Bill: " + totalAmount);
        System.out.println("Total Bill Amount: " + totalAmount);
    }
}
