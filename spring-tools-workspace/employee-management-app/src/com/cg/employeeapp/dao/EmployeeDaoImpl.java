package com.cg.employeeapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Map<Integer, Employee> employeeDb;
	
	public EmployeeDaoImpl() {
		employeeDb = new HashMap<>();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		return employeeDb.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		employeeDb.remove(employeeId);
		return !employeeDb.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employeeDb.values());
		
	}
	
	

}
