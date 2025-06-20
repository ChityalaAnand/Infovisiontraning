package com.day9;

public class WareHouse1 {
	public static void main(String[] args) {
		String[] productSlots = new String[100];
		WareHouse1 wareHouse = new WareHouse1();
		wareHouse.storeProduct(10, "Apple",productSlots);
		wareHouse.getProduct(10,productSlots);
		
		System.out.println(productSlots[10]);
			
		
	}
	public void storeProduct(int slot, String product, String[] productSlots) {
		productSlots[slot] = product;
	}
	
	public String getProduct(int slot, String[] productSlots) {
		return productSlots[slot];
	}
}
