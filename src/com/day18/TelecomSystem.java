package com.day18;

public class TelecomSystem {
	private static TelecomSystem instance;
    private final LoggerBilling logger;
    private final BillingSystem billing;

    private TelecomSystem() {
        logger = LoggerBilling.getInstance();
        billing = BillingSystem.getInstance();
        logger.log("TelecomSystem initialized.");
    }

    public static TelecomSystem getInstance() {
        if (instance == null) {
            synchronized (TelecomSystem.class) {
                if (instance == null)
                    instance = new TelecomSystem();
            }
        }
        return instance;
    }

    public void makeCall(String number, int durationInMinutes) {
        logger.log("Making a call to: " + number + " for " + durationInMinutes + " minutes");
        System.out.println("Calling " + number + "...");
        billing.addCallCharge(durationInMinutes);
    }

    public void sendSMS(String number, String message) {
        logger.log("Sending SMS to: " + number);
        System.out.println("SMS to " + number + ": " + message);
        billing.addSMSCharge(1);
    }
}
