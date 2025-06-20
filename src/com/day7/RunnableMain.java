package com.day7;

public class RunnableMain {
	public static void main(String[] args) {
		UsingRunnable myRunnable = new UsingRunnable(30, "Anand");
        Thread t1 = new Thread(myRunnable);
        t1.start();
        
        UsingRunnable myRunnable1 = new UsingRunnable(80, "Kranthi");
        Thread t2 = new Thread(myRunnable1);
        t2.start();
        
        UsingRunnable myRunnable2 = new UsingRunnable(80, "Sravan");
        Thread t3 = new Thread(myRunnable2);
        t3.start();
	}

}
