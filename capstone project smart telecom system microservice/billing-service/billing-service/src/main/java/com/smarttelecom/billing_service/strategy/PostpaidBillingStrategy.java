package com.smarttelecom.billing_service.strategy;

import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;

public class PostpaidBillingStrategy implements BillingStrategy {
    @Override
    public double calculateBill(List<UsageLogDTO> usageLogs) {
        return usageLogs.stream()
            .mapToDouble(log ->
                log.getCallDuration() * 0.5 + // 0.5 per min
                log.getDataUsed() * 0.2 +     // 0.2 per MB
                log.getSmsCount() * 0.1       // 0.1 per SMS
            ).sum();
    }
}
