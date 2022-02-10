package com.cg.foodieapp.menuservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.foodieapp.menuservice.model.MenuItem;
import com.cg.foodieapp.menuservice.repository.MenuItemRepo;

@Service
public class MenuItemServiceImpl {
	
	@Autowired
	private MenuItemRepo repo;
	
	public MenuItem addMenuItem(MenuItem item) {
		return repo.save(item);
	}
	
	public MenuItem getMenuItem(String itemCode) {
		return repo.findById(itemCode).get();
	}
	

}
