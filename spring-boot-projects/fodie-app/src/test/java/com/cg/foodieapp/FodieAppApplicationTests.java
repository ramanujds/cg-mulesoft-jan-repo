package com.cg.foodieapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.service.FoodItemService;

@SpringBootTest
class FodieAppApplicationTests {
	
	@Autowired
	FoodItemService service;

	@Test
	void addItem() {
		
		FoodItem item = new FoodItem("item101", "Pizza", 179, true, null);
		
		assertEquals(item, service.addItem(item));
		
		
	}

}
