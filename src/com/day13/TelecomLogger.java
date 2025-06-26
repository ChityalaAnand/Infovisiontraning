package com.day13;

import java.util.*;

public class TelecomLogger {
	static Vector<UsageRecord> usageLog = new Vector<>();

	public static void main(String[] args) {
		Thread callThread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					usageLog.add(new UsageRecord("C001", "CALL", 60 + i));
					sleep(200);
				}
			}
		});

		Thread smsThread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					usageLog.add(new UsageRecord("C001", "SMS", 1));
					sleep(300);
				}
			}
		});

		Thread loggerThread = new Thread(new Runnable() {
			public void run() {
				while (true) {
					if (!usageLog.isEmpty()) {
						UsageRecord record = (UsageRecord) usageLog.remove(0);
						System.out.println("Logged: " + record);
					}
					sleep(150);
				}
			}
		});

		callThread.start();
		smsThread.start();
		loggerThread.setDaemon(true);
		loggerThread.start();
	}

	static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}
}
