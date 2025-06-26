package com.day13;

public class RechargeRecord {
	String mobileNumber;
    String rechargeDate;
    double amount;

    RechargeRecord(String mobileNumber, String date, double amount) {
        this.mobileNumber = mobileNumber;
        this.rechargeDate = date;
        this.amount = amount;
    }

    public String toString() {
        return mobileNumber + " : " + rechargeDate + " : " + amount;
    }
}
