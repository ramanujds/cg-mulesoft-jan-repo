import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.Duration;

class EmployeeStreamApiOperation{

	public static void main(String []args){
		
		 Employee emp1 = new Employee(1005,"Tushar","Sharma","tushar@yahoo.com",LocalDate.of(2019,4,20),200000);
          Employee emp2 = new Employee(1002,"Mahesh","Reddy","mahesh@yahoo.com", LocalDate.of(2020,5,10),120000);
          Employee emp3 = new Employee(1005,"Suraj","Verma","suraj@gmail.com",LocalDate.of(2020,2,12),230000);
		 Employee emp4 = new Employee(1003,"Arjun","Reddy","arjun@gmail.com",LocalDate.of(2018,10,12),540000);
		 Employee emp5 = new Employee(1004,"Yasir","Khan","yasir@gmail.com",LocalDate.of(2021,2,12),430000);

		

          List <Employee> emps = Arrays.asList(emp1,emp2,emp3, emp4, emp5);

		// Method Reference

		emps.stream().map(e->e.getFirstName()).map(String::toUpperCase).forEach(System.out::println);
		
		

		// Find out the sum of salary of all employees

		// double sum = emps.stream().mapToDouble(emp->emp.getSalary()).sum();

		double sum = emps.stream().map(emp->emp.getSalary()).reduce((total,salary)->total+salary).get();

		System.out.println("Total Salary = "+sum);

		// Find out the senior most employee of an organization

		Comparator<Employee> compareByHireDate = (e1,e2)->e1.getHireDate().compareTo(e2.getHireDate());

		Employee seniorEmployee = emps.stream().min(compareByHireDate).get();

		System.out.println("Senior most employee - ");
		System.out.println(seniorEmployee);

		// List employee name, salary and salary increased by 15%

		emps.stream().map(emp->{
							double updatedSalary = emp.getSalary()+ emp.getSalary()*.15;
							System.out.print(emp.getFirstName()+" "+emp.getLastName());
							System.out.print("\t"+emp.getSalary());
							emp.setSalary(updatedSalary);
							System.out.print("\t"+updatedSalary);
							return emp;
							})
					.forEach(emp->System.out.println());

		// List employee name and duration of their service in months and days

		emps.stream().forEach(e->{
								long difference = Duration.between(e.getHireDate().atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
								long monthDiff = difference/30;
								long dayDiff = difference - monthDiff*30;
								System.out.println("Name - "+e.getFirstName()+"\t Service Duration = "+monthDiff+" months and "+dayDiff+" days");
							});
						


	}	

}