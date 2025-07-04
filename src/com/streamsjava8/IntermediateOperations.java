package com.streamsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		// Operations between the source and terminal operation
		// multiple intermediate operations allowed on one stream
		// filter, map, flatMap, peek, limit, skip, distinct, sorted
		// Stream<T> filter(Predicate<? super T> predicate)
		// filter returns a new stream without the elements that did not match the predicate
		String[] names = {"Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike"};
		List<String> nameList = new ArrayList(Arrays.asList(names));
		
		nameList.stream().filter(s -> s.startsWith("M")).forEach(s -> System.out.println(s));
		
		// map returns a new stream with all the the elements changed using the provided function
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper)
		 nameList.stream().map(s -> s + " student").forEach(s -> System.out.println(s));
	
		 // flatmap returns a stream with the elements of all collections on the stream as seperate elements on the stream, removing the collection layer(s)
		 // <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
		 String[][] names2d = {names, names};
		 String[] names1d = Stream.of(names2d).flatMap(arr -> Stream.of(arr)).toArray(size -> new String[size]);
		 System.out.println(Arrays.toString(names1d));
		 
		 // peek returns a Stream with all the elements on the Stream. The specified action will be executed for all elements
		 // Stream<T> peek(Consumer<? super T> action)
		// String[] names3d = Stream.of(names2d).flatMap(arr -> Stream.of(arr).peek(s -> System.out.println("peek:"+s)).toArray(size -> new String[size]);
		 
		 // Stream<T> limit(long maxSize)
		 // Returns a stream with the specified number of elements
		 // Stream<T> skip(long n)
		 // returns a stream with the specified number of elements skipped
		 Arrays.stream(names1d).skip(1).forEach(s -> System.out.println("skip :"+s));
		 Arrays.stream(names1d).limit(1).forEach(s -> System.out.println("limit :"+s));
		 Arrays.stream(names1d).skip(3).limit(1).forEach(s -> System.out.println("Skip and Limit :"+s));
		 
		 // distinct return a stream with only unique elements
		 // Stream<T> distinct()
		 
		 long numOfDisrtinctValues = Arrays.stream(names1d).distinct().count();
		 System.out.println("distinct value :"+ numOfDisrtinctValues);
		 }
}
