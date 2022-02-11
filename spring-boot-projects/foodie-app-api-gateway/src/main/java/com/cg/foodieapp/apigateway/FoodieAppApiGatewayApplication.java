package com.cg.foodieapp.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FoodieAppApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieAppApiGatewayApplication.class, args);
	}

}
