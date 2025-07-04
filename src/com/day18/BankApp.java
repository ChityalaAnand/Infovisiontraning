package com.day18;

public class BankApp {
	public static void main(String[] args) {
        Transaction t1 = new Transaction("ACC1001", "ACC2001", 5000.00);
        t1.processTransaction();
 
        System.out.println("--------");
 
        Transaction t2 = new Transaction("ACC3001", "ACC4001", 12000.00);
        t2.processTransaction();
    }
}
