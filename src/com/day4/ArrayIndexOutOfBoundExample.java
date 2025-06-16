package com.day4;

public class ArrayIndexOutOfBoundExample {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0;i<=array.length;i++) {
			array[i] = i*10;
		}
		
	}
}
