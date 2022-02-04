package com.cg.examples;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamApi {

	static Department department;
	
	public static void main(String[] args) {
		
		Department dept1= new Department(10,"IT","Bangalore");
		Department dept2= new Department(20,"Sales","Delhi");
		
		Employee e1 = new Employee(1001, "Rahul", "Sharma","rahul@yahoo.com", LocalDate.of(2020, 1,10), 45000,dept1 );
		Employee e2 = new Employee(1002, "Mahesh", "Reddy","mahesh@yahoo.com", LocalDate.of(2020, 10,10), 43000,dept2 );
		Employee e3 = new Employee(1003, "Suraj", "Dutta","suraj@yahoo.com", LocalDate.of(2021, 12,15), 34000,dept2 );
		Employee e4 = new Employee(1004, "Pitam", "Sharma","pritam@yahoo.com", LocalDate.of(2019, 5,12), 65000,dept1 );
		Employee e5 = new Employee(1005, "Harsh", "Verma","harsh@yahoo.com", LocalDate.of(2020, 4,17), 44000,dept1 );
		
		List<Employee> emplist = Arrays.asList(e1,e2,e3,e4,e5);

		// Dept with highest no of employees
		
		Map<Department, Integer> depts = new HashMap<Department, Integer>(); 
		
		emplist.stream().forEach(emp->{
			if(depts.containsKey(emp.getDept())) {
			int count = depts.get(emp.getDept());
			depts.put(emp.getDept(),count+1);
			}
			else {
				depts.put(emp.getDept(),1);
			}
		});
		
		//depts.forEach((k,v)->System.out.println(k.getDepartmentName()+"\t"+v));
		
		int max = depts.values().stream().max((i,j)->i-j).get();
		
		depts.forEach((k,v)->{
			if(v==max) {
				department=k;
			}
		});
		
		System.out.println(department+"\t"+max);
		
		
		Map<Department, Employee> seniorEmployees = new HashMap<Department, Employee>();
		
		emplist.stream().forEach(emp->{
			Department d=emp.getDept();
			if(seniorEmployees.containsKey(d)) {
				if(emp.getHireDate().isBefore(seniorEmployees.get(d).getHireDate())) {
					seniorEmployees.put(d, emp);
				}
			}
				else {
					seniorEmployees.put(d, emp);
				}
			
		});
		
		
		seniorEmployees.forEach((k,v)->System.out.println(k.getDepartmentName()+"\t"+v.getFirstName()));
		
	}
	
	
	
	

}
