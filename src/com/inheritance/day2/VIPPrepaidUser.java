package com.inheritance.day2;

public class VIPPrepaidUser extends PrepaidUser {
	String vipLevel = "Gold";
	public void printVIPPrepaidUserDetails() {
		System.out.println("telecom name : "+ name+" number : "+number+" balance : "+balance+" vipLevel : "+vipLevel);
	}
}
