package com.smarttelecom.billing_service.template;

import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;

public abstract class MonthlyBillingTemplate {
    public final double generateMonthlyBill(Long userId, List<UsageLogDTO> usageLogs) {
        preProcessing(userId);
        double amount = calculate(userId, usageLogs);
        postProcessing(userId, amount);
        return amount;
    }

    protected abstract void preProcessing(Long userId);
    protected abstract double calculate(Long userId, List<UsageLogDTO> usageLogs);
    protected abstract void postProcessing(Long userId, double amount);
}
