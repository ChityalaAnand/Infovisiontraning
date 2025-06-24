package com.day11;

import java.util.*;

public class UsingLinkedHashSet {
	public static void main(String[] args) {
		User user1 = new User("Anand1", 9441437496l, "anand123@gmail.com");
		User user2 = new User("Anand2", 9441437497l, "anand124@gmail.com");
		User user3 = new User("Anand3", 9441437498l, "anand125@gmail.com");
		User user4 = new User("Anand4", 9441437499l, "anand126@gmail.com");
		User user5 = new User("Anand5", 9441437499l, "anand126@gmail.com");
		User user6 = user1;
		User user7 = new User("Anand1", 9441437496l, "anand123@gmail.com");
		Set<User> user = new LinkedHashSet<>();
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		user.add(user5);
		user.add(user6);
		user.add(user7);

		System.out.println(user1.equals(user6));

		System.out.println(user1.getUserName().equals(user6.getUserName()));

		for (User u : user) {
			if(!user.equals(u)) {
				System.out.println(u.getUserName() + " : " + u.getPhone() + " : " + u.getEmail());
			}	
		}
		 

	}

}
