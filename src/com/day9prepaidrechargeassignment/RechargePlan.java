package com.day9prepaidrechargeassignment;

public class RechargePlan {
    private int planId;
    private String description;
    private double amount;

    public RechargePlan(int planId, String description, double amount) {
        this.planId = planId;
        this.description = description;
        this.amount = amount;
    }

    public int getPlanId() {
        return planId;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayPlan() {
        System.out.println(planId + ". " + description + " - ₹" + amount);
    }

}
