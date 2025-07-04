package com.ObserverPattern;

public class CarporateClient implements Subscriber{
	private String company;
	
	public CarporateClient(String company) {
		super();
		this.company = company;
	}
	
	@Override
	public void update(String message) {
		System.out.println("CarporateClient [" + company + "] received alert " + message);
		
	}
}
