package com.cg.app.testing.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.app.testing.repo.AppRepo;

@ExtendWith(MockitoExtension.class)
class AppServiceTest {

	@Mock
	AppRepo repo;
	
	@InjectMocks
	AppService service;
	
	
	
	@Test
	void testAddItem() {
		
		when(repo.addItem()).thenReturn("");
		assertEquals("Added Successfully", service.addItem("Laptop",10));
	}
	
	@Test
	void testAddItemNegativeQuantity() {

		
		assertEquals("Operation Failed", service.addItem("Laptop",-10));
	}

}
