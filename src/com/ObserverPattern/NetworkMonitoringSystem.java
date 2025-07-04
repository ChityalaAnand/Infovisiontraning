package com.ObserverPattern;
import java.util.*;
public class NetworkMonitoringSystem {
	private List<Subscriber> sub = new ArrayList();
	
	public void registerSubscriber(Subscriber s) {
		sub.add(s);
	}
	
	public void removeSubscriber(Subscriber s) {
		sub.remove(s);
	}
	
	public void notifyAllSubscribers(String message) {
		for(Subscriber s : sub) {
			s.update(message);
		}
	}
	
	public void detectNetworkUsage() {
		System.out.println("Network outage detected!");
		notifyAllSubscribers("Network outage in your are from 5pm to 10pm");
	}
	
}
