import vehicles.cars.Car;
import vehicles.bikes.Bike;
import vehicles.Vehicle;
class CarProgram{
	public static void main(String []args){
		
		Vehicle vehicle = new Car("DL10C-7676","Ford Eco Sports","White","Four-Wheeler","Sony Music System");

		vehicle.showVehicleInfo();

		vehicle.start();
		vehicle.brake();
//		ford.play();


		vehicle = new Bike("WB10C-2376","RE Classic 350","Black","Two-Wheeler","Telescopic");

		vehicle.showVehicleInfo();

		vehicle.start();
		vehicle.brake();
	

	


	}
}