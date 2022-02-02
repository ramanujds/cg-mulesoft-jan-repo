package com.cg.employeeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.util.DbConnectionUtil;

public class EmployeeDaoJdbcImpl implements EmployeeDao{
	
	Connection con;
	PreparedStatement psmt;
	ResultSet rst;

	@Override
	public Employee saveEmployee(Employee employee) throws DuplicateEmployeeException, SQLException {
		con = DbConnectionUtil.getDbConnection();
		psmt = con.prepareStatement("insert into employee_db values(?,?,?,?,?)");
		psmt.setInt(1,employee.getEmployeeId());
		psmt.setString(2, employee.getEmployeeName());
		psmt.setString(3, employee.getEmail());
		psmt.setString(4, employee.getHireDate().toString());
		psmt.setFloat(5, employee.getSalary());
		
		int rowCount = psmt.executeUpdate();
		if(rowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws SQLException {
		con = DbConnectionUtil.getDbConnection();
		psmt = con.prepareStatement("select * from employee_db where employee_id=?");
		psmt.setInt(1, employeeId);
		rst = psmt.executeQuery();
		
		if(rst.next()) {
		Employee emp = new Employee();
		emp.setEmployeeId(rst.getInt("employee_id"));
		emp.setEmail(rst.getString("email"));
		emp.setEmployeeName(rst.getString("employee_name"));
		emp.setHireDate(rst.getDate("hiredate").toLocalDate());
		emp.setSalary(rst.getFloat("salary"));
		return emp;
		}
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
	public List<Employee> getAllEmployees() throws SQLException {
		con=DbConnectionUtil.getDbConnection();
		psmt = con.prepareStatement("select * from employee_db");
		rst = psmt.executeQuery();
		List<Employee> employees = new ArrayList<>();
		
		while(rst.next()) {
			Employee emp = new Employee();
			emp.setEmployeeId(rst.getInt("employee_id"));
			emp.setEmail(rst.getString("email"));
			emp.setEmployeeName(rst.getString("employee_name"));
			emp.setHireDate(rst.getDate("hiredate").toLocalDate());
			emp.setSalary(rst.getFloat("salary"));
			employees.add(emp);
		}
		
		
		return employees;
	}
	
	
	

}
