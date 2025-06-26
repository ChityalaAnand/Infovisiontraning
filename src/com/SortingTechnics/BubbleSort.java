package com.SortingTechnics;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] array = {5, 6, 1, 3, 9, 4,  2,  8};
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(array));
	}
}
