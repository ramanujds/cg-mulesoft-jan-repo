package com.cg.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.exception.FoodItemNotFoundException;
import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.service.FoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;

//	@RequestMapping(value = "/items", method = {RequestMethod.POST})
	@PostMapping(value="/items", produces = {"application/json","application/xml"},
							consumes = {"application/json","application/xml"})
	@ResponseStatus(code = HttpStatus.CREATED)
	public FoodItem addItem(@RequestBody FoodItem item) {
		return service.addItem(item);
	}
	
	
	@GetMapping(value = "/items", produces = {"application/json","application/xml"})
	public List<FoodItem> getAllItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/items/code/{code}")
	public FoodItem getFoodItemByCode(@PathVariable("code") String itemCode) {
		return service.getItemByCode(itemCode);
	}
	
	
	@DeleteMapping("/items/code/{code}")
	public ResponseEntity<Boolean> deleteFoodItemByCode(@PathVariable("code") String itemCode)throws FoodItemNotFoundException {
	
		boolean isDeleted =  service.deleteItem(itemCode);
		
			return new ResponseEntity<>(isDeleted,HttpStatus.OK);
		
	}
	
	@PutMapping("/items")
	public ResponseEntity<FoodItem> updateItem(@RequestBody FoodItem item) {
		FoodItem updatedItem = service.updateItem(item);
		return ResponseEntity.ok(updatedItem);
	}
	
	@GetMapping("/items/name/{itemName}")
	public FoodItem searchItemByName(@PathVariable String itemName) {
		return service.findItemByName(itemName);
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
