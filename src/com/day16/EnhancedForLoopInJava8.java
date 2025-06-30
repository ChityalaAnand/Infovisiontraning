package com.day16;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoopInJava8 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(3, 6, 5, 4, 8, 9 );
		System.out.println("using for loop");
		for(int i = 0; i<values.size();i++) {
			System.out.print(values.get(i)+" ");
		}
		
		System.out.println("using advance for loop");
		for(int i : values) {
			System.out.print(i+" ");
		}
		
		System.out.println("using java 8 foor loop");
		values.forEach(i -> System.out.print(i+" "));
		values.forEach(System.out::print);
		
		
	}

}
