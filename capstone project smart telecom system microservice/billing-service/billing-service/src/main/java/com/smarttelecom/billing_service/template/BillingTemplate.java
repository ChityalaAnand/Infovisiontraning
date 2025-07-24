package com.smarttelecom.billing_service.template;

import java.time.LocalDate;
import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;
import com.smarttelecom.billing_service.entity.Bill;
import com.smarttelecom.billing_service.strategy.BillingStrategy;

public abstract class BillingTemplate {

    public Bill generateBill(Long userId, List<UsageLogDTO> logs) {
        double totalAmount = getStrategy().calculateBill(logs);
        sendNotification(userId, totalAmount);

        return Bill.builder()
                .userId(userId)
                .planType(getPlanType())
                .totalAmount(totalAmount)
                .billingDate(LocalDate.now())
                .build();
    }

    protected abstract BillingStrategy getStrategy();
    protected abstract String getPlanType();
    protected abstract void sendNotification(Long userId, double amount);
}