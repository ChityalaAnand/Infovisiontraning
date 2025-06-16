package com.inheritance.day2;

public class MainClass {
	public static void main(String[] args) {
		TelecomUser telecomUser = new TelecomUser();
		telecomUser.printTelecomUser();
		
		PrepaidUser prepaidUser = new PrepaidUser();
		prepaidUser.printPreapaidDetails();
		
		VIPPrepaidUser uipPrepaidUser = new VIPPrepaidUser();
		uipPrepaidUser.printVIPPrepaidUserDetails();
		
		PostpaidUser postPaidUser = new PostpaidUser();
		postPaidUser.printPostPaidUserDetails();
	}
}

