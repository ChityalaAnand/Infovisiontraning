package com.bankproject_version2;

import java.util.Scanner;

public class BankSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.println("Welcome to the Nationalized Bank");
        System.out.print("Enter Account Type (saving/current): ");
        String type = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Holder Mobile Number: ");
        long mobile = sc.nextLong();

        System.out.print("Enter Initial Deposit: ");
        double deposit = sc.nextDouble();

        if (type.equalsIgnoreCase("saving")) {
            account = new SavingAccount(name, mobile, deposit);
        } else if (type.equalsIgnoreCase("current")) {
            account = new CurrentAccount(name, mobile, deposit);
        } else {
            System.out.println("Invalid account type.");
            sc.close();
            return;
        }

        account.openAccount();
        account.displayAccountDetails();
        account.calculateInterest();

        System.out.print("Do you want to withdraw money? (yes/no): ");
        sc.nextLine();
        if (sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            account.withdraw(amt);
        }

        sc.close();
    }
}
