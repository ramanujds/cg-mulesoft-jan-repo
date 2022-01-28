package com.cg.employeeapp.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.employeeapp.exception.EmployeeNotFoundException;

class EmployeeDaoImplTest {
	
	EmployeeDao dao=new EmployeeDaoImpl();

//	@Test
//	void testEmployeeDaoImpl() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSaveEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetEmployeeById() {
//		fail("Not yet implemented");
//	}

	@Test
	void testDeleteEmployeeById() {
		assertThrows(EmployeeNotFoundException.class, ()->dao.deleteEmployeeById(1000));
	}

//	@Test
//	void testUpdateEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllEmployees() {
//		fail("Not yet implemented");
//	}

}
