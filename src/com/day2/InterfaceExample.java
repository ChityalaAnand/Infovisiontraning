package com.day2;

public class InterfaceExample implements  WashingMachine, Laptop{

	@Override
	public void start() {
		System.out.println("I am starting washing machine!");
	}

	@Override
	public void pause() {	
		System.out.println("I am pausing the washing machine some time!");
	}

	@Override
	public void stop() {
		System.out.println("I am stoping the wasing machine!");
	}

	@Override
	public void showOSCode() {
		System.out.println("please show the Os details of the laptop");
		
	}

}
