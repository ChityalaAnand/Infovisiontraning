package com.searchingtechniques;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {50, 10, 30, 20, 40};
        int target = 30;
        Arrays.sort(arr);
        binarySearchByNormalIterator(arr, target);
        
        
	}
	public static void binarySearchByNormalIterator(int []arr, int target) {
		int left = 0;
		int right = arr.length-1;
		boolean found = false;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				System.out.println("Target found at index : "+mid);
				found = true;
				break;
			}else if(target>arr[mid]) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		if(!found) {
			System.out.println("Target Not Found!");
		}
	}
}
