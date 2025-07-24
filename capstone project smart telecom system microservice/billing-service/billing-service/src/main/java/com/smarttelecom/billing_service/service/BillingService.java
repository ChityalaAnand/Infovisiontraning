package com.smarttelecom.billing_service.service;

import java.util.List;

import com.smarttelecom.billing_service.entity.Bill;

public interface BillingService {
	Bill generateBill(Long userId);
	List<Bill> getBillingHistory(Long userId);
}
