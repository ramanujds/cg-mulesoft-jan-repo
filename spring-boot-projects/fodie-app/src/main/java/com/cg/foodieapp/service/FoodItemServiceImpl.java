package com.cg.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.repository.FoodItemRepo;

@Service
public class FoodItemServiceImpl implements FoodItemService {

	@Autowired
	private FoodItemRepo repo;
	
	@Override
	public FoodItem addItem(FoodItem item) {
		
		return repo.addItem(item);
	}

	@Override
	public FoodItem getItemByCode(String itemCode) {
		return repo.getItemByCode(itemCode);
	}

	@Override
	public FoodItem updateItem(FoodItem item) {
		return repo.updateItem(item);
	}

	@Override
	public boolean deleteItem(String itemCode) {
		return repo.deleteItem(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.getAllItems();
	}

}
