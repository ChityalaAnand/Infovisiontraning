package com.smarttelecom.plan_service.strategy;

import com.smarttelecom.plan_service.exception.InvalidPlanException;

public class PlanFactory {
    public static PlanType getPlanType(String type) {
        return switch (type.toUpperCase()) {
            case "PREPAID" -> new PrepaidPlan();
            case "POSTPAID" -> new PostpaidPlan();
            case "DATA_ONLY" -> new DataOnlyPlan();
            default -> throw new InvalidPlanException("Invalid plan type: " + type);
        };
    }
}