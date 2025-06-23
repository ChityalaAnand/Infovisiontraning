package com.TelecomCustomerManagementSystem;

import java.util.Date;

public class Complaint {
	private String description;
	private Date date;
	public Complaint(String description) {
		super();
		this.description = description;
		this.date = new Date();
	}
	@Override
	public String toString() {
		return "Complaint [description=" + description + ", date=" + date + "]";
	}
	


}
