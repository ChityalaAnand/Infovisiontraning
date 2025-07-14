package com.telecomusingsolidmultidesignpattern;

public class PrepaidPlan implements Plan {
    public double getRatePerMinute() {
        return 0.5;
    }

    public String getType() {
        return "Prepaid";
    }
}

