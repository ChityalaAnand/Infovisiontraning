package com.smarttelecom.billing_service.strategy;

import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;

public class PrepaidBillingStrategy implements BillingStrategy {
    @Override
    public double calculateBill(List<UsageLogDTO> usageLogs) {
        return 199.0; // flat prepaid
    }
}