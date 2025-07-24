package com.telecom.api_gateway_telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayTelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayTelecomApplication.class, args);
		System.out.println("Hey Api gateway Started..");
	}

}
