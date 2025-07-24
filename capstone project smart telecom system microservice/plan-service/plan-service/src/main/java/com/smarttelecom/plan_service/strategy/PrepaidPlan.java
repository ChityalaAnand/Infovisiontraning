package com.smarttelecom.plan_service.strategy;

public class PrepaidPlan implements PlanType {
    @Override
    public String getBenefits() {
        return "Prepaid: Recharge monthly, no billing.";
    }
}
