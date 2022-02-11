package com.cg.foodieapp.orderservice.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.foodieapp.orderservice.model.MenuItem;
import com.cg.foodieapp.orderservice.model.OrderDetails;
import com.cg.foodieapp.orderservice.service.OrderServiceImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/order")
public class OrederServiceController {
	
	@Autowired
	OrderServiceImpl service;
	
	@Autowired
	RestTemplate menuServiceClient;
	
	@GetMapping("/code/{itemCode}/quantity/{quantity}")
	
	public OrderDetails getOrderDetails(@PathVariable String itemCode,@PathVariable int quantity) {
		 return service.orderItem(itemCode, quantity);
		
		
	}
	
	
}
