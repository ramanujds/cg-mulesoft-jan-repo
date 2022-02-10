package com.cg.foodieapp.orderservice.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor

public class MenuItem {


	private String itemCode;
	private String itemName;
	private float price;
	
	
}
