package com.cg.foodieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.foodieapp.model.FoodItem;

public interface FoodItemJpaRepo extends JpaRepository<FoodItem, String> {

	@Query("from FoodItem where itemName=:itemName")
	public FoodItem findByItemName(String itemName);
	
}
