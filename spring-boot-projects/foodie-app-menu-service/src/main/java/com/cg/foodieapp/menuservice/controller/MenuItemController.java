package com.cg.foodieapp.menuservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.foodieapp.menuservice.model.MenuItem;
import com.cg.foodieapp.menuservice.service.MenuItemServiceImpl;

@RestController
@RequestMapping("/items")
public class MenuItemController {

	@Autowired
	MenuItemServiceImpl service;
	
	@PostMapping
	public MenuItem addNewItem(@RequestBody MenuItem item) {
		return service.addMenuItem(item);
	}
	
	
	@GetMapping("/code/{itemCode}")
	public MenuItem getMenuItem(@PathVariable String itemCode) {
		
		return service.getMenuItem(itemCode);
	}
	
}
