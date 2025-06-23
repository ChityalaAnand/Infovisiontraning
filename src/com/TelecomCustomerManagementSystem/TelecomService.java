package com.TelecomCustomerManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;

public class TelecomService {

    private ArrayList<Customer> customers;
    private LinkedList<Complaint> complaintQueue;

    public TelecomService() {
        customers = new ArrayList<>();
        complaintQueue = new LinkedList<>();
    }

    public void addCustomer(String id, String name) {
        customers.add(new Customer(id, name));
    }

    public Customer findCustomerById(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void fileComplaint(String customerId, String description) {
        Customer c = findCustomerById(customerId);
        if (c != null) {
            Complaint complaint = new Complaint(description);
            c.fileComplaint(description);
            complaintQueue.add(complaint);
        }
    }

    public void resolveNextComplaint() {
        if (!complaintQueue.isEmpty()) {
            System.out.println("Resolving: " + complaintQueue.poll());
        } else {
            System.out.println("No complaints to resolve.");
        }
    }

    public void displayAllCustomers() {
        for (Customer c : customers) {
            c.displaySummary();
        }
    }
}
