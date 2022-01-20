import java.util.*;
import java.time.*;
class EmployeeApp{
	
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		Map<Integer,Employee> employees = new HashMap<>();

		
		Employee emp1 = new Employee(1005,"Tushar Sharma",LocalDate.of(2019,4,20),"tushar@yahoo.com");
		Employee emp2 = new Employee(1002,"Mahesh Reddy", LocalDate.of(2020,5,10),"mahesh@yahoo.com");
		Employee emp3 = new Employee(1001,"Suraj Verma",LocalDate.of(2020,2,12),"suraj@gmail.com");

		employees.put(emp1.getEmployeeId(), emp1);
		employees.put(emp2.getEmployeeId(), emp2);
		employees.put(emp3.getEmployeeId(), emp3);
		
		// Searching for an Employee with employeeId

		int id;
		
		System.out.print("Enter an ID to search : ");
		id = scan.nextInt();
		
		Employee employee = employees.get(id);

		System.out.println(employee);


	}

}