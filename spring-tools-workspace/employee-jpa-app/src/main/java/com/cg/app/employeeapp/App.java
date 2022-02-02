package com.cg.app.employeeapp;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		

	}

}
