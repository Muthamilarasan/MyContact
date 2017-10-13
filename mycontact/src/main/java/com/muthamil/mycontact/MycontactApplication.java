package com.muthamil.mycontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MycontactApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycontactApplication.class, args);
	}
}
