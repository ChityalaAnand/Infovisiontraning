package com.day2;

public class Department extends Company{
	
	String dept_id = "dept002";
	String dept_name = "HR";
	//String comp_id = "Inf002";
	//String comp_type = "Telecom";
	public void printDepartmentDetails() {
		System.out.println("dept_id : "+dept_id+" dept_name : "+dept_name+" comp_id : "+comp_id+" comp_type : "+comp_type);
	}
}
