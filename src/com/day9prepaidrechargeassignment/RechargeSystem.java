package com.day9prepaidrechargeassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class RechargeSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<RechargePlan> plans = new ArrayList<>();
		ArrayList<String> history = new ArrayList<>();

		plans.add(new RechargePlan(1, "1GB/day for 28 days", 199));
		plans.add(new RechargePlan(2, "1.5GB/day for 56 days", 399));
		plans.add(new RechargePlan(3, "Unlimited Talktime - 28 days", 149));

		double walletBalance = 500.0;

		while (true) {
			System.out.println("Prepaid Recharge Menu");
			System.out.println("1. View Plans \n2. Recharge \n3. View Wallet \n4. History \n5. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Available Plans:");
				for (RechargePlan plan : plans) {
					plan.displayPlan();
				}
				break;
			case 2:
				System.out.println("Enter Plan ID to recharge:");
				int planId = sc.nextInt();
				if (planId <= plans.size() && planId > 0) {
					RechargePlan selected = plans.get(planId - 1);
					if (walletBalance >= selected.getAmount()) {
						walletBalance -= selected.getAmount();
						history.add(selected.getDescription() + " - " + selected.getAmount());
						System.out.println("Recharge successful!");
					} else {
						System.out.println("Insufficient wallet balance.");
					}
				} else {
					System.out.println("Invalid Plan ID.");
				}
				break;
			case 3:
				System.out.println("Wallet Balance: " + walletBalance);
				break;
			case 4:
				System.out.println("Recharge History:");
				if (history.isEmpty())
					System.out.println("No recharges yet.");
				for (String entry : history)
					System.out.println(entry);
				break;
			case 5:
				System.out.println("Thank you! Exiting.");
				return;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
