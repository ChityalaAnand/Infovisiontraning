package com.day2;

//interface in java 8
@FunctionalInterface
interface Laptop{

	public void showOSCode();

	public default void showLaptopSpecification() {

		System.out.println("memmory!");

	}

}
