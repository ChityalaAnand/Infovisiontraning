package com.day10;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> call_history = new LinkedList<>();
		call_history.add("Anand");
		call_history.add("Sravan");
		call_history.add("Kranthi");
		call_history.add("Manoj");
		call_history.add("Chitti");
		call_history.add("Nisha");
		
		System.out.println(call_history);
		System.out.println("size of list "+call_history.size());
		
		
	}
}
