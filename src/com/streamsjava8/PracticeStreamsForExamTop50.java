package com.streamsjava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStreamsForExamTop50 {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(array);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
		for (Map.Entry<Boolean, List<Integer>> result : map.entrySet()) {
			System.out.println(result.getKey() + " : " + result.getValue());
		}
		System.out.println("====================================================");
		Integer[] array1 = { 1, 2, 4, 4, 5, 4, 7, 2, 9 };
		List<Integer> list1 = Arrays.asList(array);
		list1.stream().distinct().collect(Collectors.toList()).forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println("====================================================");
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		names.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println("====================================================");
		System.out.println(list1.stream().reduce(0, (a, b) -> a + b));
		System.out.println(list1.stream().mapToInt(Integer::intValue).sum());
		System.out.println("====================================================");
		Optional<String> findFirst = names.stream().findFirst();
		findFirst.ifPresent(System.out::println);
		System.out.println("====================================================");
		List<String> sorted = Arrays.asList("banana", "apple", "cherry");
		System.out.println(sorted.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));
		System.out.println(sorted.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
		System.out.println("====================================================");
		List<Integer> nums = Arrays.asList(5, 12, 12, 18, 18, 7, 3);
		List<Integer> result = nums.stream().filter(a -> a > 10).collect(Collectors.toList());
		System.out.println(result);
		Set<Integer> result1 = nums.stream().filter(a -> a > 10).collect(Collectors.toSet());
		System.out.println(result1);
		System.out.println("====================================================");
		List<String> subjects = Arrays.asList("Java", "Python", "C++");
		String result3 = subjects.stream().collect(Collectors.joining(","));
		System.out.println(result3);
	}
}
