package com.smarttelecom.billing_service.observer;

public interface NotificationObserver {
    void sendNotification(Long userId, double amount);
}
