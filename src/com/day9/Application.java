package com.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Chityala Anand", "anand@gmail.com", 9441437496L, "Male", 10000.0);
		Customer customer2 = new Customer(2, "Ravi Kumar", "ravi.kumar@example.com", 9441012345L, "Male", 12000.0);
		Customer customer3 = new Customer(3, "Sunitha Reddy", "sunitha.reddy@example.com", 9441023456L, "Female", 8000.0);
		Customer customer4 = new Customer(4, "Mahesh Babu", "mahesh.babu@example.com", 9441034567L, "Male", 15000.0);
		Customer customer5 = new Customer(5, "Kavya Sharma", "kavya.sharma@example.com", 9441045678L, "Female", 9500.0);
		Customer customer6 = new Customer(6, "Rajesh Verma", "rajesh.verma@example.com", 9441056789L, "Male", 11000.0);
		
		
		List<Customer> customersList = new ArrayList<>();
		customersList.add(customer1);
		customersList.add(customer2);
		customersList.add(customer3);
		customersList.add(customer4);
		customersList.add(customer5);
		customersList.add(customer6);
	
		

		
	}

}
