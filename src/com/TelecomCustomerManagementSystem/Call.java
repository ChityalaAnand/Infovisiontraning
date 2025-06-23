package com.TelecomCustomerManagementSystem;

public class Call {
	private String phoneNumber;
	private int duration;
	public Call(String phoneNumber, int duration) {
		super();
		this.phoneNumber = phoneNumber;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Call to " + phoneNumber + " for " + duration + " seconds";
	}
	
}
