package com.cg.app.employeeapp;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.app.employeeapp.model.Employee;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		// Insert Records

//		Employee emp1 = new Employee(1002, "Mahesh Reddy", "mahesh@yahoo.com", LocalDate.parse("2018-02-09"), 65000);
//		Employee emp2 = new Employee(1003, "Javed Khan", "javed@yahoo.com", LocalDate.parse("2019-02-09"), 55000);
//		Employee emp3 = new Employee(1004, "Roshan Dutta", "roshan@yahoo.com", LocalDate.parse("2018-05-09"), 68000);
//		

//		
//		tx.begin();
//		
//		entityManager.persist(emp1);
//		entityManager.persist(emp2);
//		entityManager.persist(emp3);
//		
//		tx.commit();

		// Fetch an Object

//		Employee emp = entityManager.find(Employee.class, 1002);
//		
//		System.out.println(emp);

		// Delete an object

//		Employee emp = entityManager.find(Employee.class, 1002);
//		if (emp != null) {
//			tx.begin();
//			entityManager.remove(emp);
//			tx.commit();
//		}
		
		// Update an object
		
//		tx.begin();
//		Employee emp = entityManager.find(Employee.class, 1003);
//		emp.setSalary(70000);
//		tx.commit();
//		System.out.println(emp);
		
		// Method 2
//		Employee emp1 = new Employee(1002, "Mahesh Reddy", "mahesh123@yahoo.com", LocalDate.parse("2018-02-09"), 76000);
//		tx.begin();
//		entityManager.merge(emp1);
//		tx.commit();
		
		// Fetch all the records
//		Query query1 = entityManager.createQuery("from Employee");
//		
//		List<Employee> employees = query1.getResultList();
//		
//		employees.forEach(e->System.out.println(e));
//		
		
		// Working with JPQL
		
		// Fetch an employee by email
//		String email = "roshan@yahoo.com";
//		Query getByEmail = entityManager.createQuery("from Employee where email=:email");
//		getByEmail.setParameter("email", email);
//		Employee emp= (Employee) getByEmail.getSingleResult();
//		System.out.println(emp);
		
		
		// TypedQuery
//		String empname="Javed Khan";
//		TypedQuery<Employee> getByEmployeeName = entityManager.createQuery("from Employee where employeeName=:ename",Employee.class);
//		getByEmployeeName.setParameter("ename", empname);
//		Employee emp1=  getByEmployeeName.getSingleResult();
//		
//		System.out.println(emp1);
		
		// Native Query
		// Fetch an employee by email
//		String email = "roshan@yahoo.com";
//		Query getByEmailNative = entityManager.createNativeQuery("select * from employee_info where email=:email",Employee.class);
//		getByEmailNative.setParameter("email", email);
//		Employee emp= (Employee)getByEmailNative.getSingleResult();
//		System.out.println(emp);
		
		// Named query
		String name = "Javed Khan";
		Query getByName_named_query = entityManager.createNamedQuery("getEmployeeByName");
		getByName_named_query.setParameter("ename", name);
		Employee emp=  (Employee)getByName_named_query.getSingleResult();
		System.out.println(emp);
		

	}

}
