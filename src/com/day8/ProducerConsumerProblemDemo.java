package com.day8;

import java.util.LinkedList;

public class ProducerConsumerProblemDemo {
	private static final int capacity = 10;
	private final LinkedList<Integer> buffer = new LinkedList();
	
	public synchronized void produce(int value) throws InterruptedException {
		while(buffer.size() == capacity) {
			wait();
		}
		buffer.add(value);
		System.out.println("product"+value);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			wait();
		}
		int value = buffer.removeFirst();
		System.out.println("Product Consumed "+value);
		notify();
	}
}
