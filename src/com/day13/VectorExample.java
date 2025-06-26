package com.day13;
import java.util.*;
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Deer");
		animals.add("Tigher");
		System.out.println(animals);
		
		animals.add(0, "Rabbits");
		System.out.println(animals);
		
		System.out.println(animals.get(3));
		System.out.println(animals.remove(0));
		
		System.out.println(animals.contains("cat"));
		System.out.println(animals.size());
	}
}
