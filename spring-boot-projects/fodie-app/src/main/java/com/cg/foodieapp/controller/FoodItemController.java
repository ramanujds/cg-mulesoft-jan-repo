package com.cg.foodieapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.model.FoodItem;

@RestController
public class FoodItemController {

	@RequestMapping("/item")
	public FoodItem getFoodItem() {
		FoodItem item = new FoodItem("c1001", "Pizza", 295.5F, true);
		return item;
	}
	
}
