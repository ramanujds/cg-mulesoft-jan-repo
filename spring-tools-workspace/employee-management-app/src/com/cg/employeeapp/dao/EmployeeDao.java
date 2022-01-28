package com.cg.employeeapp.dao;

import java.util.List;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee) throws DuplicateEmployeeException;
	
	public Employee getEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId) throws EmployeeNotFoundException;
	
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	
	public List<Employee> getAllEmployees();
	
	
}
