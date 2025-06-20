package com.day7;

public class OrderThread extends Thread{
	private Inventory inventory;
	String user;
	int quantity;
	public OrderThread(Inventory inventory, String user, int quantity) {
		super();
		this.inventory = inventory;
		this.user = user;
		this.quantity = quantity;
	}
	
	public void run() {
		inventory.purchase(user, quantity);
	}
}
