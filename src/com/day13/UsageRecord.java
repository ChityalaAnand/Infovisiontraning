package com.day13;

public class UsageRecord {
	String customerId;
    String type;
    int value;

    public UsageRecord(String customerId, String type, int value) {
        this.customerId = customerId;
        this.type = type;
        this.value = value;
    }

    public String toString() {
        return customerId + " - " + type + ": " + value;
    }
}
