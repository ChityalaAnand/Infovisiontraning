package com.telecomusingsolidmultidesignpattern;
import java.util.List;

public class BillingEngine {
    private static BillingEngine instance;

    private BillingEngine() {}

    public static BillingEngine getInstance() {
        if (instance == null) {
            instance = new BillingEngine();
        }
        return instance;
    }

    public void generateBill(Customer customer, List<CallLog> logs) {
        double total = 0;
        for (CallLog log : logs) {
            total += log.getDurationInMinutes() * customer.getPlan().getRatePerMinute();
        }
        System.out.println("Bill for " + customer.getPhoneNumber() + ": " + total);
    }
}

