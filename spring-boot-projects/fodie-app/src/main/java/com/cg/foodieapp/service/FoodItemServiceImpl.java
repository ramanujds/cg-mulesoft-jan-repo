package com.cg.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.foodieapp.dto.RecipeDto;
import com.cg.foodieapp.exception.DuplicateItemException;
import com.cg.foodieapp.exception.FoodItemNotFoundException;
import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.repository.FoodItemJpaRepo;

import lombok.Data;


@Service
@Data
public class FoodItemServiceImpl implements FoodItemService {

	@Autowired
	private FoodItemJpaRepo repo;
	
	@Autowired
	private RestTemplate rt;
	
	@Value("${API_URL}")
	private String apiUrl;
	
	@Override
	public FoodItem addItem(FoodItem item) {
		if(repo.existsById(item.getItemCode())) {
			throw new DuplicateItemException("Item with Code - "+item.getItemCode()+" already present..");
		}
		return repo.save(item);
	}

	@Override
	public FoodItem getItemByCode(String itemCode) {
		FoodItem item = repo.findById(itemCode).get();
		RecipeDto recipe = rt.getForObject(apiUrl+item.getItemName(), RecipeDto.class);
		item.setRecipe(recipe);
		return item;
	}

	@Override
	public FoodItem updateItem(FoodItem item) {
		
		return repo.save(item);
	}

	@Override
	public boolean deleteItem(String itemCode)throws FoodItemNotFoundException {
		if(!repo.existsById(itemCode)) {
			throw new FoodItemNotFoundException("Item with code - "+itemCode+" Not Found..");
		}
		repo.deleteById(itemCode);
		 return !repo.existsById(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.findAll();
	}
	
	public FoodItem findItemByName(String itemName) {
		return repo.findByItemName(itemName);
	}

}
