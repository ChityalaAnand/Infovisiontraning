package com.day8;

public class ConsumerThread extends Thread {
private ProducerConsumerProblemDemo pcpd;
	
	public ConsumerThread(ProducerConsumerProblemDemo pcpd) {
		super();
		this.pcpd = pcpd;
	}
	
	public void run() {
		try {
			while(true) {
				pcpd.consume();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
