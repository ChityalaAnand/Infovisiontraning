package com.day12;
import java.util.*;
public class ProductInventory {
	public static void main(String[] args) {
		Map<String, Product> inventory = new HashMap<>();
		inventory.put("P001", new Product("i phone 16", 79999.00, 10));
		inventory.put("P002", new Product("samsung galaxy s24", 99999.00, 15));
		inventory.put("P003", new Product("oneplus", 88888.00, 20));
		
		String searchId = "P004";
		Product searchProduct = inventory.get(searchId);
		
		if(searchProduct != null) {
			System.out.println("Product Found : "+searchProduct);
		}else {
			System.out.println("Product Not Found : "+searchProduct);
		}
	}
}
