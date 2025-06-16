package com.day1;

public class BillingSystem {
	private static double taxRate = 0.1;
	
	private double subTotal;
	
	public BillingSystem() {
		subTotal = 0.0;
	}
	
	public void addItem(double price) {
		subTotal += price;
	}
	
	public double getTotal() {
		return subTotal + (subTotal*taxRate);
	}
	
	public static void setTaxRate(double rate) {
		taxRate = rate;
	}
	
	public static void main(String[] args) {
		BillingSystem bs = new BillingSystem();
		bs.addItem(400);
		bs.addItem(800);
		System.out.println("Total bill after adding tax is "+ bs.getTotal());
	}

}
