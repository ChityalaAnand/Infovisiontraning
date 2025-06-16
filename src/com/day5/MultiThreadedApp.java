package com.day5;

public class MultiThreadedApp {
	public static void main(String[] args) {
        User user = new User("Alice");
      //  Object lock = new Object();

        Call call = new Call(user);
     //   SMS sms = new SMS(user);
     //  Billing billing = new Billing(lock);
     //   Usage usage = new Usage(lock);

        call.start();
       // sms.start();
       // billing.start();

		/*
		 * try { call.join(); sms.join(); Thread.sleep(1000); } catch
		 * (InterruptedException e) {}
		 * 
		 * usage.start();
		 * 
		 * // Deprecated stop() demo (not recommended) Thread deprecated = new Thread(()
		 * -> { while (true) { System.out.println("Deprecated thread running..."); try {
		 * Thread.sleep(300); } catch (InterruptedException e) {} } });
		 * deprecated.start(); try { Thread.sleep(1000); } catch (InterruptedException
		 * e) {} System.out.println("Stopping deprecated thread..."); deprecated.stop();
		 * // ⚠️ Deprecated
		 */    }
}

