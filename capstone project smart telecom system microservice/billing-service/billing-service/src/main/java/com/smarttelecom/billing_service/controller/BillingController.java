package com.smarttelecom.billing_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smarttelecom.billing_service.entity.Bill;
import com.smarttelecom.billing_service.service.BillingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/billing")
@RequiredArgsConstructor
public class BillingController {

    private final BillingService billingService;

    @PostMapping("/generate/{userId}")
    public ResponseEntity<Bill> generateBill(@PathVariable Long userId) {
        return ResponseEntity.ok(billingService.generateBill(userId));
    }

    @GetMapping("/history/{userId}")
    public ResponseEntity<List<Bill>> getBillingHistory(@PathVariable Long userId) {
        return ResponseEntity.ok(billingService.getBillingHistory(userId));
    }
}
