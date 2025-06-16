package com.inheritance.day2;

public class PrepaidUser extends TelecomUser{
	double balance = 500;
	public void printPreapaidDetails() {
		System.out.println("telecom name : "+ name+" number : "+number+" balance : "+balance);
	}
}
