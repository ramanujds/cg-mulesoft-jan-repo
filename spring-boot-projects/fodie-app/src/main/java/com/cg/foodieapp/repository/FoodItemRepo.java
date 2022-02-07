package com.cg.foodieapp.repository;

import java.util.List;

import com.cg.foodieapp.model.FoodItem;

public interface FoodItemRepo {

	public FoodItem addItem(FoodItem item);
	
	public FoodItem getItemByCode(String itemCode);
	
	public FoodItem updateItem(FoodItem item);
	
	public boolean deleteItem(String itemCode);
	
	public List<FoodItem> getAllItems();
	
}
