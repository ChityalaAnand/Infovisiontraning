package com.TelecomCustomerCallRecordsAnalyzer;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class MainClass {
	public static void main(String[] args) {
		List<CallRecord> call = Arrays.asList(
							new CallRecord("Anand", "sravan", LocalDateTime.now().minusMinutes(10), LocalDateTime.now(), "Airtel", "Hyderabad"),
							new CallRecord("Kranthi", "chitti", LocalDateTime.now().minusMinutes(5), LocalDateTime.now(), "Jio", "Delhi"),
							new CallRecord("manoj", "madan", LocalDateTime.now().minusMinutes(20), LocalDateTime.now().minusMinutes(10), "Airtel", "Hyderabad"));
		
		System.out.println("Finding Longest duration");
		call.stream().sorted(Comparator.comparingLong(CallRecord::getDuration).reversed()).limit(2).forEach(System.out::println);
        System.out.println(" Frequent Callers:");
        call.stream().collect(Collectors.groupingBy(CallRecord::getCaller, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(" Group by Operator:");
        Map<String, List<CallRecord>> byOperator = call.stream().collect(Collectors.groupingBy(CallRecord::getOperator));
        byOperator.forEach((op, list) ->
            System.out.println(op + ": " + list.size() + " calls")
        );
        System.out.println(" Calls from Hyderabad:");
        call.stream().filter(r -> r.getLocation().equalsIgnoreCase("Hyderabad")).forEach(System.out::println);

	}

}
