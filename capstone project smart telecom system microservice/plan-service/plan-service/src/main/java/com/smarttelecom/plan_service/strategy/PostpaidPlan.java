package com.smarttelecom.plan_service.strategy;

public class PostpaidPlan implements PlanType {
    @Override
    public String getBenefits() {
        return "Postpaid: Pay after usage, detailed bills.";
    }
}