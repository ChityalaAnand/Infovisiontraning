package com.day7;

public class InventoryMain {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		OrderThread orderThread = new OrderThread(inventory, "Anand", 20);
		Thread user1 = new Thread(orderThread);
		user1.start();
		
		OrderThread orderThread1 = new OrderThread(inventory, "Anand", 50);
		Thread user2 = new Thread(orderThread1);
		user2.start();

		
		OrderThread orderThread2 = new OrderThread(inventory, "Anand", 10);
		Thread user3 = new Thread(orderThread2);
		user3.start();
		
	}
}
