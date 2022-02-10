package com.cg.foodieapp.menuservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class MenuItem {

	@Id
	private String itemCode;
	private String itemName;
	private float price;
	
	
}
