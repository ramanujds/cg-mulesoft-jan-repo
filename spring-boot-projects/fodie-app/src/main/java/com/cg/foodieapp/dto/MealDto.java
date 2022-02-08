package com.cg.foodieapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealDto {

	private int idMeal;
	private String strMeal;
	private String strCategory;
	private String strArea;
	private String strInstructions;
	private String strIngredient1;
	private String strIngredient2;
	private String strIngredient3;
	private String strIngredient4;
	private String strIngredient5;
	
}
