package com.cg.foodieapp.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.orderservice.model.OrderDetails;
import com.cg.foodieapp.orderservice.service.OrderServiceImpl;

@RestController
@RequestMapping("/order")
public class OrederServiceController {
	
	@Autowired
	OrderServiceImpl service;
	
	@GetMapping("/code/{itemCode}/quantity/{quantity}")
	public OrderDetails getOrderDetails(@PathVariable String itemCode,@PathVariable int quantity) {
		return service.orderItem(itemCode, quantity);
	}

}
