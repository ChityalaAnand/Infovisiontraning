package com.day11;

import java.util.*;
import java.util.stream.Collectors;

class Contact1 {
	private String name;
	private String phoneNumber;
	private String email;
	private String department;

	public Contact1(String name, String phoneNumber, String email, String department) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public String getDepartment() {
		return department;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Contact1))
			return false;
		Contact1 contact = (Contact1) o;
		return name.equalsIgnoreCase(contact.name) && phoneNumber.equals(contact.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name.toLowerCase(), phoneNumber);
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + " department=" + department+"]";
	}

}

public class AlphabeticSortByName {
	public static void main(String[] args) {
		Contact1[] simContacts = {
	            new Contact1("Jeevan", "9876543210", "jeevan@sim.com","HR"),
	            new Contact1("Nisha", "9123456789", "nisha@sim.com","IT"),
	            new Contact1("Chitti", "9988776655", "chitti@sim.com","HR")
	        };
        Contact1[] googleContacts = {
        		new Contact1("Jaya", "9876543210", "jaya@sim.com", "Admin"),
                new Contact1("Nivetha", "9123456789", "nivi@sim.com","HR"),
                new Contact1("Chitti", "9988776655", "chitti@sim.com","IT")     // Duplicate
        };
        Contact1[] phoneContacts = {
        		new Contact1("Srinivas", "9876543210", "srinivas@sim.com","Admin"),
                new Contact1("Chityala", "9123456789", "chityala@sim.com","HR"),
                new Contact1("Nivetha", "9123456789", "nivi@sim.com", "IT")
        };
 		
        Set<Contact1> uniqueContacts = new HashSet<>();
        Collections.addAll(uniqueContacts, simContacts);
        Collections.addAll(uniqueContacts, googleContacts);
        Collections.addAll(uniqueContacts, phoneContacts);
        
        List<Contact1> sortedContact = new ArrayList<>(uniqueContacts);
        for (Contact1 contact : sortedContact) {
            System.out.println(contact);
        }
        
        System.out.println("============================================");
		sortedContact.sort(Comparator.comparing(Contact1::getName, String.CASE_INSENSITIVE_ORDER));
        Map<String, List<Contact1>> grouped = sortedContact.stream().collect(Collectors.groupingBy(Contact1::getDepartment));
        grouped.forEach((dept, contacts) -> {
            System.out.println("Department: " + dept);
            contacts.forEach(c -> System.out.println(" - " + c));
        }); 
        
		/*
		 * //Display contacts System.out.println(" alphabecatilly sorted contacts : ");
		 * for(Contact1 c : sortedContact ) { System.out.println(" - " +c); }
		 */
        
	}
}
