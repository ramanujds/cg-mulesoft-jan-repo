package com.cg.foodieapp.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OrderDetails {

	private String orderCode;
	private MenuItem itemOrdered;
	private float total;
	
	
}
