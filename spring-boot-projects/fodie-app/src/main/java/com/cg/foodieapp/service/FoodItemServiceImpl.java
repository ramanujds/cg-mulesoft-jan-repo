package com.cg.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.foodieapp.dto.RecipeDto;
import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.repository.FoodItemRepo;

@Service
public class FoodItemServiceImpl implements FoodItemService {

	@Autowired
	private FoodItemRepo repo;
	
	@Autowired
	private RestTemplate rt;
	
	@Value("${API_URL}")
	private String apiUrl;
	
	@Override
	public FoodItem addItem(FoodItem item) {
		
		return repo.addItem(item);
	}

	@Override
	public FoodItem getItemByCode(String itemCode) {
		FoodItem item = repo.getItemByCode(itemCode);
		RecipeDto recipe = rt.getForObject(apiUrl+item.getItemName(), RecipeDto.class);
		item.setRecipe(recipe);
		return item;
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
