package com.day7;

public class Holder {
	String data;
	synchronized void putFruit(String str) throws InterruptedException {
		if(data != null) {
			wait();
		}
		data = str;
		System.out.println(data+" Placed");
	}
	synchronized String getFruit() throws InterruptedException {
		if(data == null) {
			wait();
		}
		String s = data;
		data = null;
		notify();
		return s;
	}
}  
