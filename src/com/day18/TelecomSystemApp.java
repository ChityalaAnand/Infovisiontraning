package com.day18;

public class TelecomSystemApp {
	public static void main(String[] args) {
		TelecomSystem telecom = TelecomSystem.getInstance();

		telecom.makeCall("+919999888877", 3);
		telecom.sendSMS("+919999888877", "Hello!");
		telecom.sendSMS("+919999888877", "How are you?");

		BillingSystem billing = BillingSystem.getInstance();
		billing.printBill();
	}
}
