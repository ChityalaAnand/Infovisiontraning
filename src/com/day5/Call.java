package com.day5;

class Call extends Thread {
    User user;
   public Call(User user) { 
    	this.user = user; 
    }

    public void run() {
        System.out.println(user.name + " is on a call...");
        try {
            Thread.sleep(1000);
            Thread.yield();
        } catch (InterruptedException e) {}
        System.out.println(user.name + " ended the call.");
    }
}
