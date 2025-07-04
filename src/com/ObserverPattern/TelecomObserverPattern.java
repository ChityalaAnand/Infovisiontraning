package com.ObserverPattern;

public class TelecomObserverPattern {
	public static void main(String[] args) {
		NetworkMonitoringSystem system = new NetworkMonitoringSystem();
		Subscriber user1 = new PreapaidUser("Anand");
		Subscriber user2 = new PostPaidUser("Sravan");
		Subscriber user3 = new CarporateClient("Kranthi");
		
		system.registerSubscriber(user1);
		system.registerSubscriber(user2);
		system.registerSubscriber(user3);
		
		system.detectNetworkUsage();
	}
}
