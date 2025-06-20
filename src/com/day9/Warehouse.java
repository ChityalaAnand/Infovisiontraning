package com.day9;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Warehouse wareHouse = new Warehouse();
		wareHouse.storeProduct(10, "Apple",list);
		wareHouse.getProduct(10,list);
		
		System.out.println(list.get(10));
			
		
	}
	public void storeProduct(int slot, String product, List<String> list) {
		list.add(slot, product);
	}
	
	public String getProduct(int slot, List<String> list) {
		return list.get(10);
	}
}
