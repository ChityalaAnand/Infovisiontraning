package com.day11;

import java.util.*;

public class TelecomSetExample {
    public static void main(String[] args) {
        Set<String> activeSimCards = new HashSet<>();
        activeSimCards.add("9876543210");
        activeSimCards.add("9123456789");
        activeSimCards.add("9988776655");
        activeSimCards.add("9876543210"); 

        System.out.println("Active SIM Cards HashSet:");
        activeSimCards.forEach(System.out::println);

  
        Set<String> blacklistedNumbers = new LinkedHashSet<>();
        blacklistedNumbers.add("8880002222");
        blacklistedNumbers.add("9990001111");
        blacklistedNumbers.add("7770003333");

        System.out.println(" Blacklisted Numbers LinkedHashSet - Insertion Order :");
        blacklistedNumbers.forEach(System.out::println);

        Set<String> networkRegions = new TreeSet<>();
        networkRegions.add("Region-West");
        networkRegions.add("Region-North");
        networkRegions.add("Region-East");

        System.out.println("Network Regions TreeSet - Sorted :");
        networkRegions.forEach(System.out::println);

        String incomingCallNumber = "9990001111";
        if (blacklistedNumbers.contains(incomingCallNumber)) {
            System.out.println("Alert: " + incomingCallNumber + " is blacklisted!");
        }
        
        String newSimRequest = "9876543210";
        if (!activeSimCards.contains(newSimRequest)) {
            activeSimCards.add(newSimRequest);
            System.out.println("New SIM card added: " + newSimRequest);
        } else {
            System.out.println("SIM card " + newSimRequest + " already active.");
        }
    }
}

