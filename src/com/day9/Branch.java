package com.day9;

import java.util.*;

public class Branch {
	private String branchName;
	private List<Customer> customers;
	
	public Branch(String branchName, List<Customer> customers) {
		super();
		this.branchName = branchName;
		this.customers = new ArrayList<>();
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", customers=" + customers + "]";
	}

	
}
