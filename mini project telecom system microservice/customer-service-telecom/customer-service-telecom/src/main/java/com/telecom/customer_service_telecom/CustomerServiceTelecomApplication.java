package com.telecom.customer_service_telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceTelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceTelecomApplication.class, args);
		System.out.println("hey Customer Services started");
	}

}
