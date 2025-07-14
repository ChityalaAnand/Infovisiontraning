package com.telecomusingsolidmultidesignpattern;
public class PlanFactory {
    public static Plan createPlan(String type) {
        if (type.equalsIgnoreCase("prepaid")) {
            return new PrepaidPlan();
        } else if (type.equalsIgnoreCase("postpaid")) {
            return new PostpaidPlan();
        }
        throw new IllegalArgumentException("Invalid plan type");
    }
}

