package com.ObserverPattern;

public class PostPaidUser implements Subscriber {
	private String name;

	public PostPaidUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("PostPaid User [" + name + "] received alert " + message);
	}
}
