package com.cg.foodieapp.service;

import java.util.List;

import com.cg.foodieapp.exception.FoodItemNotFoundException;
import com.cg.foodieapp.model.FoodItem;

public interface FoodItemService {

	public FoodItem addItem(FoodItem item);
	
	public FoodItem getItemByCode(String itemCode);
	
	public FoodItem updateItem(FoodItem item);
	
	public boolean deleteItem(String itemCode)throws FoodItemNotFoundException;
	
	public List<FoodItem> getAllItems();
	
	public FoodItem findItemByName(String itemName);
	
}
