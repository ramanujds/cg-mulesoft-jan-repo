package com.cg.employeeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws DuplicateEmployeeException, SQLException;
	
	public Employee getEmployeeById(int employeeId) throws SQLException;
	
	public boolean deleteEmployeeById(int employeeId) throws EmployeeNotFoundException, SQLException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeNotFoundException, SQLException;
	
	public List<Employee> getAllEmployees() throws SQLException;
	
}
