package com.day9;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Monday");
		fruits.add("Tuesday");
		fruits.add("Wednessday");
		fruits.add("Thursday");
		fruits.add("Friday");
		fruits.add("Saturday");
		fruits.add("Sunday");
		fruits.set(6,"Sunday is RestDay");
		
		for(int i = 0;i<fruits.size();i++) {
			System.out.println(i+1 +" day is "+ fruits.get(i));
		}
	}
}
