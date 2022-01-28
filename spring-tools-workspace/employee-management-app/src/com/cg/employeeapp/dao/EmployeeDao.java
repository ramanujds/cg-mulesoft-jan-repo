package com.cg.employeeapp.dao;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	
}
