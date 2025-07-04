package com.streamsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// forEach, min, max, count, allMatch, anyMatch, collect, noneMatch
public class CommonTerminalOperations {
	public static void main(String[] args) {
		// void forEach(Consumer<? super T> action)
		// Executes the specified action for every element in the stream
		String[] names = {"Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike"};
		List<String> nameList = new ArrayList(Arrays.asList(names));
		Arrays.stream(names).forEach(name -> System.out.println(name));
		
		// min, max, and count 
		// Optional<T> min(Comparator<? super T> comparator)
		// Optional<T> max(Comparator<? super T> comparator)
		// long count
		Optional<String> result = Arrays.stream(names).min((a, b) -> a.compareTo(b));
		System.out.println(result);
		
		/*Optional<Integer> minGenerates = Stream.generate(() -> 5).min((a, b) -> a.compareTo(b));
		System.out.println(minGenerates);*/
		
		// allMatch, anyMatch and noneMatch
		// boolean allMatch(Predicate<? super T> predicate)
		// boolean anyMatch(Predicate<? super T> predicate)
		// boolean noneMatch(Predicate<? super T> predicate)
		 boolean result1 = nameList.stream().allMatch(name -> !name.isEmpty());
		 System.out.println("all match : "+result1);
		 
		 // collect and reduce
		 // <R,A> R collect(Collector<? super T,A,R> collector)
		 
		 List<String> listNamesLongerThan5 = nameList.stream().filter(a -> a.length()>5).collect(Collectors.toList());
		 System.out.println(listNamesLongerThan5);
		 
		 // Optional<T> reduce(BinaryOperator<T>accumulator)
		 
		 int[] ints = {1, 2, 3, 4, 5};
		int total = Arrays.stream(ints).reduce(0, (x, y) -> x+y);
		 System.out.println(total);
		 
		 
		
	}
}
