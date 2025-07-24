package com.telecom.customer_service_telecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.customer_service_telecom.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	boolean existsByEmail(String email);
}
