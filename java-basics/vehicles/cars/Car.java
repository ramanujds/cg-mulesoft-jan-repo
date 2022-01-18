package vehicles.cars;
public class Car{
	private String regNo;  // properties
	private String model;	// or fields
	private String color;	// or instance variables
	public static String vehicleType; // static/class variable

	public Car(){
		System.out.println("Car Initialized..");
	}	

	public Car(String regNo, String model, String color){
		this.regNo = regNo;
		this.model = model;
		this.color = color;
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

	public void start(){
		System.out.println("Engine Strated...");
	}

	public void brake(){
		System.out.println("Brakes Applied..");
	}

	public void showCarInfo(){
		System.out.println("Reg No. - "+regNo);
		System.out.println("Model - "+model);
		System.out.println("Color - "+color);
		System.out.println("Vehicle Type - "+vehicleType);
	}
		
}