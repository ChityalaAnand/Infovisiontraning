package com.day5;

class Billing extends Thread {
    Object lock;
    Billing(Object lock) { this.lock = lock; }

    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Billing waiting...");
                lock.wait(); // wait for usage
                System.out.println("Billing processed.");
            } catch (InterruptedException e) {}
        }
    }
}
