package com.telecom.customer_service_telecom.services;

import java.util.List;
import java.util.Optional;

import com.telecom.customer_service_telecom.models.Customer;

public interface CustomerService {
	boolean emailExists(String email);
	Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);	
    boolean deleteCustomerById(Long id);
}
