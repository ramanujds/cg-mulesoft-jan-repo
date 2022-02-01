package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.dao.EmployeeDao;
import com.cg.employeeapp.dao.EmployeeDaoImpl;
import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao daoObj;
	
	public EmployeeServiceImpl() {
		daoObj = new EmployeeDaoImpl();
	}
	
	@Override
	public Employee addEmployee(Employee employee)throws DuplicateEmployeeException {
		return daoObj.saveEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return daoObj.getAllEmployees();
	}

}