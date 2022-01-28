package com.cg.employeeapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Map<Integer, Employee> employeeDb;
	
	public EmployeeDaoImpl() {
		employeeDb = new HashMap<>();
	}

	@Override
	public Employee saveEmployee(Employee employee)throws DuplicateEmployeeException {
		if(employeeDb.containsKey(employee.getEmployeeId())) {
			throw new DuplicateEmployeeException("Employee with ID ["+employee.getEmployeeId()+"] is already present");
		}
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		return employeeDb.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId)throws EmployeeNotFoundException {
		if(!employeeDb.containsKey(employeeId)) {
			throw new EmployeeNotFoundException("Employee with ID ["+employeeId+"] Not Found");
		}
		employeeDb.remove(employeeId);
		return !employeeDb.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		if(!employeeDb.containsKey(employee.getEmployeeId())) {
			throw new EmployeeNotFoundException("Employee with ID ["+employee.getEmployeeId()+"] Not Found");
		}
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employeeDb.values());
		
	}
	
	

}
