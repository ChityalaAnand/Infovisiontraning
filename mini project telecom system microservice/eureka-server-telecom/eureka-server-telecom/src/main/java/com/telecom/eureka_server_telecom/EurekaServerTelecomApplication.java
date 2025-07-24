package com.telecom.eureka_server_telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerTelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTelecomApplication.class, args);
		System.out.println("Hey Eureka Server Started....");
	}

}
