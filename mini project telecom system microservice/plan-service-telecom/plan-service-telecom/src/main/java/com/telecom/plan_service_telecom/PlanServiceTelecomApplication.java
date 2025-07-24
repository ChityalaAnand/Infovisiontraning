package com.telecom.plan_service_telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlanServiceTelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanServiceTelecomApplication.class, args);
		System.out.println("Hey plan Server Started....");
	}

}
