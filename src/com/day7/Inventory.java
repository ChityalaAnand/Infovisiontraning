package com.day7;

public class Inventory {
	private int stock = 100;
	
	public synchronized void purchase(String user, int quantity) {
		if(stock >= quantity) {
			System.out.println(user+" purchased "+quantity + " item");
			stock -= quantity;
			System.out.println("Remaining Stock : "+ getStock());
		}else {
			System.out.println("Not Purchased !");
		}
	}
	
	public int getStock() {
		return stock;
	}
}
