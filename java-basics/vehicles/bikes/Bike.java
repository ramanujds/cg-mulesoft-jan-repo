package vehicles.bikes;
import vehicles.Vehicle;

public class Bike extends Vehicle{
	

	private String suspensionType;

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