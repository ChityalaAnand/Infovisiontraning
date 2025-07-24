package com.smarttelecom.billing_service.strategy;

import java.util.List;

import com.smarttelecom.billing_service.dto.UsageLogDTO;

public interface BillingStrategy {
    double calculateBill(List<UsageLogDTO> usageLogs);
}