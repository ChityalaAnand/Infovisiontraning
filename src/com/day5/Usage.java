package com.day5;

class Usage extends Thread {
    Object lock;
    Usage(Object lock) { this.lock = lock; }

    public void run() {
        synchronized (lock) {
            System.out.println("Usage detected. Notifying billing...");
            lock.notify(); // notify billing
        }
    }
}
