package com.day4.telecomprojectexception;

import java.util.Scanner;

public class TelecomApp {
	public static void main(String[] args) throws InvalidMobileNumberException, InvalidRechargeAmountException, RechargeServiceUnavailableException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Mobile Number");
		String mobileNumber = sc.next();
		TelecomService ts = new TelecomService();
		ts.recharge(mobileNumber);
		
		System.out.println("Entered mobile number is correct please enter amount");
		long amount = sc.nextLong();
		ts.checkRechargeAmount(amount);
		
		long rechargePlan = sc.nextLong();
		ts.checkRechargeValidPlans(rechargePlan);
		
		
		
		
	}
}
