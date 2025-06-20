package com.day8;

public class ProducerThread extends Thread {
	private ProducerConsumerProblemDemo pcpd;
	
	public ProducerThread(ProducerConsumerProblemDemo pcpd) {
		super();
		this.pcpd = pcpd;
	}
	
	public void run() {
		int value = 0;
		try {
			while(true) {
				pcpd.produce(value++);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
