package com.day12;
import java.util.*;
public class MapPractice {
	public static void main(String[] args) {
		Map<Integer, String> customer = new HashMap<>();
		System.out.println(customer.size());
		customer.put(101, "Anand");
		customer.put(101, "Kranthi");
		System.out.println(customer);
		System.out.println(customer.size());
		
		Map<String, List<String>> customer1 = new HashMap<>();
		customer1.put("Fashion",Arrays.asList("Anand","Sravan","Kranthi"));
		customer1.put("Laptops",Arrays.asList("Chityala","Manoj","Mohan"));
		customer1.put("girls",Arrays.asList("Ramya","Nisha","Pranali"));
		System.out.println(customer1);
		
		customer1.putIfAbsent("Electronics", new ArrayList<>());
		customer1.get("Electronics").add("JAYA");
		
		for(Map.Entry<String, List<String>> result : customer1.entrySet()) {
			System.out.println(result.getKey()+" : "+result.getValue());
		}
	}
}
