package com.day10;

import java.util.*;
import java.util.concurrent.*;

public class QueuePractice {
    public static void main(String[] args) throws InterruptedException {
  
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Customer1");
        customerQueue.add("Customer2");
        System.out.println("LinkedList Queue: " + customerQueue);
        System.out.println("Serving: " + customerQueue.poll());
        System.out.println(customerQueue);


        Deque<String> actions = new ArrayDeque<>();
        actions.push("Type A");
        actions.push("Type B");
        System.out.println("Undo Action: " + actions.pop());

        PriorityQueue<Integer> taskQueue = new PriorityQueue<>();
        taskQueue.add(3);
        taskQueue.add(1);
        taskQueue.add(2);
        System.out.println("PriorityQueue next task: " + taskQueue.poll());

        
        BlockingQueue<String> logQueue = new ArrayBlockingQueue<>(2);
        Thread producer = new Thread(() -> {
            try {
                logQueue.put("Log1");
                logQueue.put("Log2");
                System.out.println("Produced logs");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Consumed: " + logQueue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();


        Queue<String> eventQueue = new ConcurrentLinkedQueue<>();
        eventQueue.add("Event1");
        eventQueue.add("Event2");
        System.out.println("ConcurrentLinkedQueue: " + eventQueue.poll());
    }
}

