package com.day11;
import java.util.HashSet;
import java.util.Set;
public class User {
	private String userName;
	private Set<String> userIntrest;
	private long phone;
	private String email;
	
	public User(String userName, long phone, String email) {
		this.userName = userName;
		this.phone = phone;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String userName) {
		this.userName = userName;
		this.userIntrest = new HashSet<>();
	}
	
	public void addIntrest(String intrest) {
		boolean added = userIntrest.add(intrest);
		if(added) {
			System.out.println(userName +" added "+ intrest +" intrest");
		}else {
			System.out.println(userName + " already have "+intrest+" It will not allow duplicates");
		}
	}
	
	public void showIntrests() {
		System.out.println(userName+ " intrests are "+userIntrest);
	}
		
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ContactSyncApp1))
			return false;

		User contact = (User) o;
		return userName.equalsIgnoreCase(contact.userName) && phone == contact.phone && email.equals(contact.email);
	}

}
