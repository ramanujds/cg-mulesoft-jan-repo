import java.time.LocalDate;
class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	private LocalDate joinDate;
	private String email;

	public Employee() {
	}
	
	public Employee(int employeeId, String employeeName, LocalDate joinDate, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joinDate = joinDate;
		this.email = email;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString(){
		return "Employee [ID - "+employeeId+", Name - "+employeeName+", Joined Date - "+joinDate+", Email - "+email+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		return true;
	}

	public int compareTo(Employee anotherEmployee){
		return this.getEmployeeName().compareTo(anotherEmployee.getEmployeeName());
	}


}