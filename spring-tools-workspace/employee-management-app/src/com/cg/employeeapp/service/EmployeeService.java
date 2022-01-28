package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws DuplicateEmployeeException;
	
	public Employee getEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId) throws EmployeeNotFoundException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeNotFoundException;
	
	public List<Employee> getAllEmployees();
	
}
