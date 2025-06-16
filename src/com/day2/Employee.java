package com.day2;

public class Employee extends Department{
	
	int emp_id = 3744;
	String emp_name = "Anand";
	public void printEmployeeDetails() {
		System.out.println("emp_id : "+emp_id+" emp_name : "+emp_name+" dept_id : "+dept_id+" dept_name : "+dept_name+" comp_id : "+comp_id+" comp_type : "+comp_type);
	}

}
