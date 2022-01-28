package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
}
