package vehicles.cars;
import vehicles.Vehicle;

public class Car extends Vehicle{
	

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