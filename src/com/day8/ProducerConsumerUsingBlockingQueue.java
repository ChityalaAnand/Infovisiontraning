package com.day8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> bq = new ArrayBlockingQueue(10);
		
		Runnable producer = () -> {
			int value = 0;
			try {
				while(true) {
					bq.put(value);
					System.out.println("produce "+value);
					value++;
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable consumer = () -> {
			try {
				while(true) {
					int value = bq.take();
					System.out.println("consume "+value);
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		new Thread(consumer).start();
		new Thread(producer).start();
		
	}
}
