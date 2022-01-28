package com.cg.unittestapp;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class MathOperationTest {
	
	MathOperation op;
	
	@BeforeAll
	public void init() {
		System.out.println("Testing Started..");
		op = new MathOperation();
	}
	
	@BeforeEach
	public void initEachTest() {
		System.out.println("Test Begin..");
	}
	
	@AfterEach
	public void finalizeEachTest() {
		System.out.println("Test End..");
	}
	
	@AfterAll
	public void finalizeAllTest() {
		System.out.println("All test Completed..");
	}
	

	@Test
	//@EnabledOnOs(value = OS.WINDOWS)
	public void testAdd() {
		
		assertEquals(15, op.add(5, 10));
		
	}
	
	@Test
	//@DisabledOnJre(value = JRE.JAVA_15)
	public void testSubtract() {
		assertEquals(4, op.subtract(10, 6));
	}

	@Test
	//@Disabled
	public void testDivide() {
		assertEquals(2, op.divide(10, 5));
	}
	
	@Test
	public void testDivideForException() {
		assertThrows(ArithmeticException.class, ()->op.divide(10,0) );
	}
	
	
}
