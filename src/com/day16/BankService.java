package com.day16;
import java.util.*;
public class BankService implements IntrestCalculator{
	private Map<String, Customer> customers = new HashMap<>();

	public void addCustomer(String id, String name) {
		customers.putIfAbsent(id, new Customer(id, name));
	}

	public Optional<Customer> findCustomer(String id) {
		return Optional.ofNullable(customers.get(id));
	}

	public void deposit(String id, double amount) {
		findCustomer(id).ifPresent(c -> c.getAccount().deposit(amount));
	}

	public void withdraw(String id, double amount) {
		findCustomer(id).ifPresent(c -> c.getAccount().withdraw(amount));
	}

//    public List<Transaction> filterTransactions(String id, TransactionFilter filter) {
//        return findCustomer(id)
//                .map(c -> c.getAccount().getTransactionStream()
//                    .filter(filter::test)
//                    .collect(Collectors.toList()))
//                .orElse(Collections.emptyList());
//    }

	public double checkInterest(String id, double rate) {
		return findCustomer(id).map(c -> calculateInterest(c.getAccount().getBalance(), rate)).orElse(0.0);
	}
}
