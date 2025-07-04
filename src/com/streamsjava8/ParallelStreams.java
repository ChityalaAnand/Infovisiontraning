package com.streamsjava8;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreams {
	public static void main(String[] args) {
		// use .parallelStream() instead of .stream()
		// use the .parallel() method on a Stream these are the two way we can create parallel streams
		// different outcomes with parallel streams
		int total = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel().reduce(1, (x, y) -> x+y);
		System.out.println(total);
		
		String[] names = {"Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike"};
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		
		long startPar = System.currentTimeMillis();
		nameList.parallelStream().filter(s -> s.startsWith("M")).forEach(s->System.out.println(s));
		long endPar = System.currentTimeMillis();
		System.out.println("Parallel took :"+(endPar - startPar));
		
		long startSeq = System.currentTimeMillis();
		nameList.stream().filter(s -> s.startsWith("M")).forEach(s->System.out.println(s));
		long endSeq = System.currentTimeMillis();
		System.out.println("Sequential took :"+(endSeq - startSeq));
		// when to use parallel Streams
		// 1. when performance needs to be improved
		// 2. Lots of elements
		// 3. Heavy work on the stream
	}
}
