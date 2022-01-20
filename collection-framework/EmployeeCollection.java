import java.time.LocalDate;
import java.util.*;

class EmployeeCollection{
	
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee(1005,"Tushar Sharma",LocalDate.of(2019,4,20),"tushar@yahoo.com");
		Employee emp2 = new Employee(1002,"Mahesh Reddy", LocalDate.of(2020,5,10),"mahesh@yahoo.com");
		Employee emp3 = new Employee(1001,"Suraj Verma",LocalDate.of(2020,2,12),"suraj@gmail.com");
		

		
		List <Employee>employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);

		//Comparator<Employee> compareByEmployeeId = (e1, e2) -> e1.getEmployeeId() - e2.getEmployeeId();
		
		//Collections.sort(employeeList, compareByEmployeeId);

		//employeeList.forEach(e -> System.out.println(e));
		
		// Searching for an Employee with employeeId

		int id;
		
		System.out.print("Enter an ID to search : ");
		id=scan.nextInt();
		
		Employee employee = null;
		
		for(Employee e:employeeList){
			if(e.getEmployeeId() == id){
				employee=e;
				break;
			}
		}
		
		System.out.println(employee);

	}

}