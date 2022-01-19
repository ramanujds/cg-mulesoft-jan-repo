package vehicles.bikes;
import vehicles.Vehicle;

public class Bike extends Vehicle{
	



	private String suspensionType;

	public Bike() { }

	public Bike(String regNo, String model, String color, String vehicleType, String suspensionType){
		super(regNo, model, color, vehicleType);
		this.suspensionType=suspensionType;
		
	}

	public void setSuspensionType(String suspensionType){
		this.suspensionType=suspensionType;
	}

	public String getSuspensionType(){
		return suspensionType;
	}

	
	public void sideStand(){
		System.out.println("Side Stand Applied");
	}


	public void brake(){
		
		System.out.println("Brakes Applied on Bike..ABS Worked..");
	}


		
}