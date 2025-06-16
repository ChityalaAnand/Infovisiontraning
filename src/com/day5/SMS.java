package com.day5;

class SMS extends Thread {
    User user;
    SMS(User user) { 
    	this.user = user; 
    }

    public void run() {
        System.out.println(user.name + " is sending SMS...");
        try {
            Thread.sleep(500); // simulate SMS
        } catch (InterruptedException e) {}
        System.out.println(user.name + " sent SMS.");
    }
}
