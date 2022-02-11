package com.cg.foodieapp.orderservice.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.orderservice.model.MenuItem;
import com.cg.foodieapp.orderservice.model.OrderDetails;
import com.cg.foodieapp.orderservice.service.OrderServiceImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/order")
public class OrederServiceController {
	
	@Autowired
	OrderServiceImpl service;
	
	@GetMapping("/code/{itemCode}/quantity/{quantity}")
	@CircuitBreaker(name="foodieapp-order-service", fallbackMethod = "orderItemFallback")
	public OrderDetails getOrderDetails(@PathVariable String itemCode,@PathVariable int quantity) {
		return service.orderItem(itemCode, quantity);
	}
	
	public OrderDetails orderItemFallback(@PathVariable String itemCode,@PathVariable int quantity) {
		
		MenuItem item = new MenuItem("m-101", "Sandwich", 100);
		float total = 5*item.getPrice();
		OrderDetails order = new OrderDetails();
		order.setItemOrdered(item);
		order.setTotal(total);
		String orderCode = "s-"+LocalDate.now().getMonthValue()+"-"+LocalTime.now().toString();
		order.setOrderCode(orderCode);
		return order;
		
	}

}
