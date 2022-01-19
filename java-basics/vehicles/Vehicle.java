package vehicles;
public abstract class Vehicle{
	protected String regNo;  // properties
	protected String model;	// or fields
	protected String color;	// or instance variables
	protected String vehicleType;

	public Vehicle(){ }

	public Vehicle(String regNo, String model, String color, String vehicleType){
		this.regNo=regNo;
		this.model=model;
		this.color=color;
		this.vehicleType=vehicleType;
		
	}

	public void setRegNo(String regNo){
		this.regNo=regNo;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public String getModel(){
		return model;
	}

	public void setColor(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}

	public void setVehicleType(String vehicleType){
		this.vehicleType=vehicleType;
	}
	
	public String getVehicleType(){
		return vehicleType;
	}

	public void start(){
		System.out.println("Engine Strated...");
	}

	// Abstract Method
	public abstract void brake();

	public void showVehicleInfo(){
		System.out.println("Reg No. - "+regNo);
		System.out.println("Model - "+model);
		System.out.println("Color - "+color);
		System.out.println("Vehicle Type - "+vehicleType);
	}
}