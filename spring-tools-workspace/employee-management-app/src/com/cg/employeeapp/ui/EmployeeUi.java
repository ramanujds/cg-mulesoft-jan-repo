package com.cg.employeeapp.ui;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.EmployeeService;
import com.cg.employeeapp.service.EmployeeServiceImpl;

public class EmployeeUi {

	Scanner scan;
	EmployeeService serviceObj ;
	
	public EmployeeUi() {
		scan = new Scanner(System.in);
		serviceObj = new EmployeeServiceImpl() ;
	}
	
	public void showMenu() {
		System.out.println("\nSelect an Option : ");
		System.out.println("1 - Add Employee");
		System.out.println("2 - View all Employees");
		System.out.println("3 - Search an Employee");
		System.out.println("4 - Exit");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			addEmployee();
			break;
		case 2:
			showAllEmployees();
			break;
		case 3:
			searchEmployee();
			break;
		case 4:
			System.exit(1);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		
	}
	
	public void addEmployee() {
		System.out.println("Enter Employee Details : ");
		System.out.print("Employeee ID : ");
		int employeeId = scan.nextInt();
		System.out.print("Employee Name : ");
		String employeeName = scan.next()+scan.nextLine();
		System.out.print("Email : ");
		String email = scan.next()+scan.nextLine();
		System.out.print("Hire Date[yyyy-mm-dd] : ");
		String dateString = scan.next()+scan.nextLine();
		
		LocalDate hireDate = LocalDate.parse(dateString);
		System.out.print("Salary : ");
		float salary = scan.nextFloat();
		
		Employee employee= new Employee(employeeId, employeeName, email, hireDate, salary);
		try {
		Employee savedEmployee = serviceObj.addEmployee(employee);
		System.out.println(employee);
		}
		catch (DuplicateEmployeeException ex) {
			System.out.println("Error!! "+ex.getMessage());
		} catch (SQLException e) {
			
			System.err.println("DB Connection Error!! "+e.getMessage());
		}
		
		
	}
	
	public void showAllEmployees() {
		
		List<Employee> employees=null;
		try {
			employees = serviceObj.getAllEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employees.forEach(emp->System.out.println(emp));
		
	}
	
	public void searchEmployee() {
		System.out.print("Enter ID to search : ");
		int employeeId = scan.nextInt();
		try {
			Employee emp = serviceObj.getEmployeeById(employeeId);
			System.out.println(emp);
		} catch (SQLException e) {
			System.err.println("DB Connection Error!! "+e.getMessage());
		}
	}
	
}
