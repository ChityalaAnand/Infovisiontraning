package com.day18;

import java.time.LocalDateTime;

public class LoggerBilling {
	private static LoggerBilling instance;

    private LoggerBilling() {}

    public static LoggerBilling getInstance() {
        if (instance == null) {
            synchronized (LoggerBilling.class) {
                if (instance == null)
                    instance = new LoggerBilling();
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " [LOG] " + message);
    }
}

