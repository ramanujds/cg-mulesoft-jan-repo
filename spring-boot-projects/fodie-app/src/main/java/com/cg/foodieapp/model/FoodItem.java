package com.cg.foodieapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.cg.foodieapp.dto.RecipeDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FoodItem {

	@Id
	private String itemCode;
	private String itemName;
//	@JsonIgnore
	private float price;
//	@JsonProperty("availity-status")
	private boolean isAvailable;
	
	@Transient
	private RecipeDto recipe;
	
}
