package com.smarttelecom.plan_service.strategy;

public class DataOnlyPlan implements PlanType {
    @Override
    public String getBenefits() {
        return "Data-only: No calls/SMS, only internet.";
    }
}