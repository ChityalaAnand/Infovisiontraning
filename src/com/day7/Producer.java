package com.day7;

public class Producer extends Thread {
	String fruits[] = {"apple", "banana", "cherry", "mango", "orange"};
	Holder h;
	public void run() {
		for(int i = 0;i<fruits.length;i++) {
			try {
				h.putFruit(fruits[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
