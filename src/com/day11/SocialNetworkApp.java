package com.day11;

public class SocialNetworkApp {
	public static void main(String[] args) {
		User user1 = new User("Anand");
		user1.addIntrest("Reading");
		user1.addIntrest("Cooking");
		user1.addIntrest("Traveling");
		user1.showIntrests();
		System.out.println("---------------------------------------");
		User user2 = new User("Kranthi");
		user2.addIntrest("Reading");
		user2.addIntrest("Cooking");
		user2.addIntrest("Traveling");
		user2.addIntrest("Reading");
		user2.showIntrests();
	}
}
