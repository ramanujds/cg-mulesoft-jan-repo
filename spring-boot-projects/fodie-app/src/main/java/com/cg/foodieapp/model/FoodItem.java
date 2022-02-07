package com.cg.foodieapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

	private String itemCode;
	private String itemName;
	@JsonIgnore
	private float price;
	@JsonProperty("availity-status")
	private boolean isAvailable;
	
}
