package vehicles.cars;
import vehicles.Vehicle;

public class Car extends Vehicle{
	
	public Car(){ }

	public Car(String regNo, String model, String color, String vehicleType, String musicSystem){
		super(regNo, model, color, vehicleType);
		this.musicSystem=musicSystem;
		
	}

	private String musicSystem;

	public void setMusicSystem(String musicSystem){
		this.musicSystem=musicSystem;
	}

	public String getMusicSystem(){
		return musicSystem;
	}

	
	public void play(){
		System.out.println("Playing music on "+musicSystem);
	}
	

	public void brake(){
		
		System.out.println("Brakes Applied on Car..");
	}
		
}