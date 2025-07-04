package com.streamsjava8;
import java.util.*;
public class StreamsExample1 {
	public static void main(String[] args) {
		String[] names = {"Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike"};
		List<String> nameList = new ArrayList(Arrays.asList(names));
		for(String name : names) {
			if(name.startsWith("A") || name.startsWith("a")) {
				nameList.add(name);
			}
		}
		System.out.println(nameList);
		
		for(int i = 0;i<names.length;i++) {
			if(!names[i].equals("Maaike")) {
				names[i] += " student";
			}
			System.out.println(names[i]);
		}
		
		List<String> newNameList = Arrays.asList(names);
		for(String name : newNameList) {
			if(name.equals("Maaike")) {
				newNameList.remove(name);
			}
		}
		/*
		 * the above piece of code works perfectly fine but ugly syntax, hard to read, easy to make mistakes and hard to maintain
		 * to over come this stream api came into picture
		 * functional programming , operations on the elements, sequentially or parallel
		 * stream pipeline
		 * with out the terminal operation, the stream is lazy and the intermediate operations are not executed
		 * you cannot reuse a terminated stream
		 * */
		
		
		
		
	}
}
