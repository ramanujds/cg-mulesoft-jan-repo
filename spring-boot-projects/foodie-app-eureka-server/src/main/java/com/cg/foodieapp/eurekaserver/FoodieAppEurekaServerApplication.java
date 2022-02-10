package com.cg.foodieapp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FoodieAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieAppEurekaServerApplication.class, args);
	}

}
