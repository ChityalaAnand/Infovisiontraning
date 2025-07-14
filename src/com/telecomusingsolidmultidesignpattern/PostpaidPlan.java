package com.telecomusingsolidmultidesignpattern;
public class PostpaidPlan implements Plan {
    public double getRatePerMinute() {
        return 0.8;
    }

    public String getType() {
        return "Postpaid";
    }
}

