package com.searchingtechniques;

public class LinearSearch {
	public static void main(String[] args) {
		int array[] = {50, 10, 30, 20, 40};
		int target = 30;
		boolean targetFount = false;
		for(int i = 0; i<array.length;i++) {
			if(array[i] == target) {
				System.out.println("The target found in the index of : "+i+ "and the taget value is : "+target);
				targetFount = true;
				break;
			}
		}
		if(!targetFount) {
			System.out.println("Target Not Found!");
		}
	}
}
