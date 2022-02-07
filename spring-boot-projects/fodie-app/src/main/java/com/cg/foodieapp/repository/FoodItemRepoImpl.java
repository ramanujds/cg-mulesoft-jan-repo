package com.cg.foodieapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.cg.foodieapp.model.FoodItem;

@Repository
public class FoodItemRepoImpl implements FoodItemRepo, InitializingBean {

	Map<String, FoodItem> items;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		items = new HashMap<>();
		
	}
	
	
	@Override
	public FoodItem addItem(FoodItem item) {
		items.put(item.getItemCode(), item);
		return item;
	}

	@Override
	public FoodItem getItemByCode(String itemCode) {
		return items.get(itemCode);
	}

	@Override
	public FoodItem updateItem(FoodItem item) {
		items.put(item.getItemCode(), item);
		return item;
	}

	@Override
	public boolean deleteItem(String itemCode) {
		items.remove(itemCode);
		return !items.containsKey(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		
		return new ArrayList<>(items.values());
	}

}
