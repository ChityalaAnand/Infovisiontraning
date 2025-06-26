package com.day13;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int [] array = {5, 6, 1, 3, 9, 4,  2,  8};
		
		for(int i = 0;i<array.length-1;i++) {
			int min = i;
			for(int j = i+1;j<array.length;j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
