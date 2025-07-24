package com.smarttelecom.billing_service.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smarttelecom.billing_service.dto.UsageLogDTO;
import com.smarttelecom.billing_service.entity.Bill;
import com.smarttelecom.billing_service.observer.EmailNotification;
import com.smarttelecom.billing_service.observer.NotificationObserver;
import com.smarttelecom.billing_service.observer.SmsNotification;
import com.smarttelecom.billing_service.reposistory.BillingRepository;
import com.smarttelecom.billing_service.strategy.PostpaidBillingStrategy;
import com.smarttelecom.billing_service.template.BillingTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BillingServiceImpl extends BillingTemplate implements BillingService {

    private final BillingRepository billRepository;
    private final RestTemplate restTemplate;
    
    @Value("${usage.service.url}")
	private String userServiceUrl;

    private final NotificationObserver sms = new SmsNotification();
    private final NotificationObserver email = new EmailNotification();

    @Override
    public Bill generateBill(Long userId) {
        // Fetch logs from usage-service
        String url = userServiceUrl + "/api/usage/" + userId;
        UsageLogDTO[] logsArray = restTemplate.getForObject(url, UsageLogDTO[].class);
        List<UsageLogDTO> logs = Arrays.asList(logsArray);

        Bill bill = super.generateBill(userId, logs);
        return billRepository.save(bill);
    }

    @Override
    public List<Bill> getBillingHistory(Long userId) {
        return billRepository.findByUserId(userId);
    }

    @Override
    protected void sendNotification(Long userId, double amount) {
        sms.sendNotification(userId, amount);
        email.sendNotification(userId, amount);
    }

    @Override
    protected String getPlanType() {
        return "POSTPAID";
    }

    @Override
    protected PostpaidBillingStrategy getStrategy() {
        return new PostpaidBillingStrategy();
    }
}