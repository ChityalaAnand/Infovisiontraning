package com.ObserverPattern;

public class PreapaidUser implements Subscriber {
	private String name;
	
	public PreapaidUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("Prepaid User ["+ name +"] received alert "+message);
	}
}
