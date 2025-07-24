package com.telecom.customer_service_telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.customer_service_telecom.exception.CustomerNotFoundException;
import com.telecom.customer_service_telecom.exception.EmailAlreadyExistsException;
import com.telecom.customer_service_telecom.exception.NoCustomersFoundException;
import com.telecom.customer_service_telecom.models.Customer;
import com.telecom.customer_service_telecom.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid Customer customer) {
        if (customerService.emailExists(customer.getEmail())) {
            throw new EmailAlreadyExistsException(customer.getEmail());
        }

        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    @GetMapping
    public ResponseEntity<?> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();

        if (customers.isEmpty()) {
            throw new NoCustomersFoundException("No customers found.");
        }

        return ResponseEntity.ok(customers);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Customer customer = customerService.getCustomerById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));

        return ResponseEntity.ok(customer);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
        boolean deleted = customerService.deleteCustomerById(id);
        if (!deleted) {
            throw new CustomerNotFoundException(id);
        }
        return ResponseEntity.ok("Customer with ID " + id + " deleted successfully.");
    }

}