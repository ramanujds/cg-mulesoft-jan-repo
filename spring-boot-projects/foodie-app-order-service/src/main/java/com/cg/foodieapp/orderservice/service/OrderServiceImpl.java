package com.cg.foodieapp.orderservice.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.foodieapp.orderservice.model.MenuItem;
import com.cg.foodieapp.orderservice.model.OrderDetails;

@Service
public class OrderServiceImpl {
	
	@Autowired
	RestTemplate menuServiceClient;
	
	private String menuServiceUri="http://localhost:8100/items/code/";

	public OrderDetails orderItem(String itemCode, int quantity) {
		
		MenuItem item = menuServiceClient.getForObject(menuServiceUri+itemCode, MenuItem.class);
		float total = quantity*item.getPrice();
		OrderDetails order = new OrderDetails();
		order.setItemOrdered(item);
		order.setTotal(total);
		String orderCode = "s-"+LocalDate.now().getMonthValue()+"-"+LocalTime.now().toString();
		order.setOrderCode(orderCode);
		return order;
		
	}
	
}
