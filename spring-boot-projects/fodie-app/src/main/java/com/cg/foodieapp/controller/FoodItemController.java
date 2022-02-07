package com.cg.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.service.FoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;

//	@RequestMapping(value = "/items", method = {RequestMethod.POST})
	@PostMapping("/items")
	public FoodItem addItem(@RequestBody FoodItem item) {
		return service.addItem(item);
	}
	
	
	@GetMapping("/items")
	public List<FoodItem> getAllItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/items/code/{code}")
	public FoodItem getFoodItemByCode(@PathVariable("code") String itemCode) {
		return service.getItemByCode(itemCode);
	}
	
	
	@DeleteMapping("/items/code/{code}")
	public boolean deleteFoodItemByCode(@PathVariable("code") String itemCode) {
		return service.deleteItem(itemCode);
	}
	
	@PutMapping("/items")
	public FoodItem updateItem(@RequestBody FoodItem item) {
		return service.updateItem(item);
	}
	
	
	
//	@RequestMapping("/item")
//	public FoodItem getFoodItem() {
//		FoodItem item = new FoodItem("c1001", "Pizza", 295.5F, true);
//		return item;
//	}
	
//	@RequestMapping("/hello")
//	public String sayHello() {
//		return "show.html";
//	}
	
}
