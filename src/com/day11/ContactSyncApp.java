package com.day11;
import java.util.*;

public class ContactSyncApp {
	public static void main(String[] args) {
		String[] simContacts = {"Srinivas", "Sravan", "Jeevan", "Jaya", "Akash"};
		String[] googleContacts = {"Nisha", "Nivetha", "Lavanya", "Ramya", "Kirutika", "Akash"};
		String[] phoneContacts = {"Chiiti", "Mohan", "Madan", "Pawan", "Chityala", "Jaya"};
		
		Set<String> unique = new HashSet<>();
		Set<String> unique1 = new TreeSet<>();
		for(String contact : simContacts) {
			unique.add(contact);
			unique1.add(contact);
		}
		
		for(String contact : googleContacts) {
			unique.add(contact);
			unique1.add(contact);
		}
		
		for(String contact : phoneContacts) {
			unique.add(contact);
			unique1.add(contact);
		}
		
		System.out.println(unique);
		System.out.println(unique1);
	}
}
