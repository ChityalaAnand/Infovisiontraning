package com.smarttelecom.billing_service.template;

import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;
import com.smarttelecom.billing_service.observer.NotificationObserver;
import com.smarttelecom.billing_service.strategy.BillingStrategy;

public class ConcreteMonthlyBilling extends MonthlyBillingTemplate {

    private BillingStrategy strategy;
    private List<NotificationObserver> observers;

    public ConcreteMonthlyBilling(BillingStrategy strategy, List<NotificationObserver> observers) {
        this.strategy = strategy;
        this.observers = observers;
    }

    @Override
    protected void preProcessing(Long userId) {
        System.out.println("Fetching user " + userId + " usage logs...");
    }

    @Override
    protected double calculate(Long userId, List<UsageLogDTO> usageLogs) {
        return strategy.calculateBill(usageLogs);
    }

    @Override
    protected void postProcessing(Long userId, double amount) {
        for (NotificationObserver observer : observers) {
            observer.sendNotification(userId, amount);
        }
    }
}