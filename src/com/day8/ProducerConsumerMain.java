package com.day8;

public class ProducerConsumerMain {
	public static void main(String[] args) {
		ProducerConsumerProblemDemo pcpd = new ProducerConsumerProblemDemo();
		ProducerThread pt = new ProducerThread(pcpd);
		pt.start();
		
		ConsumerThread ct = new ConsumerThread(pcpd);
		ct.start();
	}
}
