package com.cg.app.employeeapp;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.app.employeeapp.model.Employee;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");
		
		EntityManager entityManager = factory.createEntityManager();
		
		Employee emp = new Employee(1001, "Kumar Dutta", "kumar@yahoo.com", LocalDate.parse("2018-02-09"), 65000);
		
		EntityTransaction tx = entityManager.getTransaction();
		
		tx.begin();
		
		entityManager.persist(emp);
		
		tx.commit();
		

	}

}
