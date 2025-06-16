package com.inheritance.day2;

public class PostpaidUser extends TelecomUser {
	double billAmount = 800;
	void printPostPaidUserDetails() {
		System.out.println("telecom name : "+ name+" number : "+number+" billAmount : "+billAmount);
	}
}
