package com.cg.foodieapp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.foodieapp.model.FoodItem;
import com.cg.foodieapp.repository.FoodItemJpaRepo;

@ExtendWith(SpringExtension.class)
class FoodItemServiceImplTest {
	
	FoodItem item = new FoodItem("item101", "Pizza", 179, true, null);
	
	@InjectMocks
	FoodItemServiceImpl service;
	
	@Mock
	private FoodItemJpaRepo repo;

	@Test
	void testAddItem() {
		
		when(repo.save(item)).thenReturn(item);
		assertEquals(item, service.addItem(item));
		
	}

}
