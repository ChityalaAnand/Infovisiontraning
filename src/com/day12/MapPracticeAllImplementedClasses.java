package com.day12;
import java.time.LocalDate;
import java.util.*;
public class MapPracticeAllImplementedClasses {
	public static void main(String[] args) {
		Map<String, String> dailyUsage = new HashMap<>();

        dailyUsage.put("06/06/2025", "800MB");
        dailyUsage.put("10/06/2025", "900MB");
        dailyUsage.put("08/06/2025", "1.2GB");
        dailyUsage.put("09/06/2025", "650MB");
        dailyUsage.put("07/06/2025", "700MB");
        dailyUsage.put(null, "810MB");
        dailyUsage.put("", "880MB");

        for (Map.Entry<String, String> entry : dailyUsage.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("-------------------");
        
        Map<String, String> dailyUsage1 = new TreeMap<>();
        dailyUsage1.put("06/06/2025", "800MB");
        dailyUsage1.put("10/06/2025", "900MB");
        dailyUsage1.put("08/06/2025", "1.2GB");
        dailyUsage1.put("09/06/2025", "650MB");
        dailyUsage1.put("07/06/2025", "700MB");
       // dailyUsage1.put(null, "810MB");
        dailyUsage1.put("", "880MB");

        for (Map.Entry<String, String> entry : dailyUsage1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
System.out.println("-------------------");
        
        Map<String, String> dailyUsage2 = new LinkedHashMap<>();
        dailyUsage2.put("06/06/2025", "800MB");
        dailyUsage2.put("10/06/2025", "900MB");
        dailyUsage2.put("08/06/2025", "1.2GB");
        dailyUsage2.put("09/06/2025", "650MB");
        dailyUsage2.put("07/06/2025", "700MB");
        dailyUsage2.put(null, "810MB");
        dailyUsage2.put("", "880MB");

        for (Map.Entry<String, String> entry : dailyUsage2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
	}
}
