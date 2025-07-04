package com.day18;

public class SingletonPattern {
	private static SingletonPattern instance;
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		if(instance == null) {
			new SingletonPattern();
		}
		return instance;
	}

}
