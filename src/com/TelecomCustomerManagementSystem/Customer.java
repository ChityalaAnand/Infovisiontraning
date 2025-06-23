package com.TelecomCustomerManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;

public class Customer {

    private String customerId;
    private String name;
    private LinkedList<Call> callHistory;
    private ArrayList<String> vasServices;
    private LinkedList<Complaint> complaints;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.callHistory = new LinkedList<>();
        this.vasServices = new ArrayList<>();
        this.complaints = new LinkedList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addCall(String number, int duration) {
        callHistory.add(new Call(number, duration));
    }

    public void subscribeVAS(String service) {
        if (!vasServices.contains(service)) {
            vasServices.add(service);
        }
    }

    public void unsubscribeVAS(String service) {
        vasServices.remove(service);
    }

    public void fileComplaint(String description) {
        complaints.add(new Complaint(description));
    }

    public void viewComplaints() {
        for (Complaint c : complaints) {
            System.out.println(c);
        }
    }

    public void displaySummary() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("VAS Subscriptions: " + vasServices);
        System.out.println("Call History:");
        for (Call c : callHistory) {
            System.out.println("  " + c);
        }
        System.out.println("Complaints:");
        for (Complaint c : complaints) {
            System.out.println("  " + c);
        }
        System.out.println("--------------------------------------------------");
    }
}
