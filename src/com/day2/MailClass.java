package com.day2;

public class MailClass {
	 public static void main(String[] args) {
		 TvRemote tv = new TvRemoteHandling();
		  tv.display();
		  tv.displayJioHotstar();
		  tv.showNetFlix();
		  
		  System.out.println("==============================");
		  
		  AbstractExample tv1 = new AbstractExample();
		  tv1.display();
		  tv1.showNetflix();
		  
		  System.out.println("==============================");
		  
		  AbstractExample2 tv2 = new AbstractExample2();
		  tv2.display();
		  tv2.displayJioHotstar();
		  
		  System.out.println("==============================");
		  ;
		  InterfaceExample ie = new InterfaceExample();
		  ie.start();
		  ie.pause();
		  ie.stop();
		  ie.showOSCode();
		  ie.showLaptopSpecification();
		  
		  System.out.println("==============================");
		  
		  Company c = new Company();
		  c.showCompanyDeatails();
		  
		  Department d = new Department();
		  d.printDepartmentDetails();
		  
		  Employee e = new Employee();
		  e.printEmployeeDetails();
	 }	 
}
