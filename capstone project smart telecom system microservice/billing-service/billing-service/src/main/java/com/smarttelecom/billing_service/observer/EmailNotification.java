package com.smarttelecom.billing_service.observer;

public class EmailNotification implements NotificationObserver {
    @Override
    public void sendNotification(Long userId, double amount) {
        System.out.println("Email sent to user " + userId + ": Your bill is ₹" + amount);
    }
}