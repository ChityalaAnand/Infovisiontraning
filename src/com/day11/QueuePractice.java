package com.day11;

import java.util.PriorityQueue;
import java.util.*;

public class QueuePractice {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(3);
		queue.offer(9);
		queue.offer(1);
		queue.offer(2);
		queue.offer(11);
		queue.offer(15);
		queue.offer(4);
		queue.offer(7);
		
		
	/*  queue.add(3);
		queue.add(9);
		queue.add(1);
		queue.add(2); 
		queue.add(11);
		queue.add(15);
		queue.add(4);
		queue.add(7); */
		
		System.out.println(queue);
	}

}
