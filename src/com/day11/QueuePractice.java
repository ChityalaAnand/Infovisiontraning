package com.day11;

import java.util.PriorityQueue;
import java.util.*;

public class QueuePractice {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(3);
		queue.add(9);
		queue.offer(1);
		queue.add(2);
		queue.offer(11);
		queue.offer(15);
		queue.offer(4);
		queue.offer(7);
		for(Integer inte : queue) {
			System.out.println(inte);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println("----------------------");
		
		Queue<String> queue1 = new PriorityQueue<String>();
		queue1.offer("Suresh");
		queue1.add("Anand");
		queue1.offer("Ramesh");
		queue1.add("anand");
		queue1.offer("kranthi");
		queue1.offer("pavan");
		queue1.offer("venky");
		queue1.offer("madhu");
		for(String str : queue1) {
			System.out.println(str);
		}
		System.out.println(queue1);
		System.out.println(queue1.poll());
		System.out.println(queue1.remove());
		System.out.println(queue1);
		System.out.println(queue1.peek());
		System.out.println(queue1);
		
	}

}
