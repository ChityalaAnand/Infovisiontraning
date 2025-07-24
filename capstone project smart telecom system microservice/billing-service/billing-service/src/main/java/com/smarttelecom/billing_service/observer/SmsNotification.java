package com.smarttelecom.billing_service.observer;

public class SmsNotification implements NotificationObserver {
    @Override
    public void sendNotification(Long userId, double amount) {
        System.out.println("SMS sent to user " + userId + ": Your bill is ₹" + amount);
    }
}