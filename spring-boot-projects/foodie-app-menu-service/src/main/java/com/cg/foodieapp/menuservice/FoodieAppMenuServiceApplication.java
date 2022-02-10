package com.cg.foodieapp.menuservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FoodieAppMenuServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieAppMenuServiceApplication.class, args);
	}

}
