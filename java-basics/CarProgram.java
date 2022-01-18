import vehicles.cars.Car;
import vehicles.bikes.Bike;
import vehicles.Vehicle;
class CarProgram{
	public static void main(String []args){
		
		Car ford = new Car();
		ford.setVehicleType("Four Wheeler");
		ford.setRegNo("KA05A-2025");
		ford.setModel("Ford Eco-Sprots");
		ford.setColor("White");
		ford.setMusicSystem("Sony Dolby Atmos Music System");

		ford.showVehicleInfo();

		ford.start();
		ford.brake();
		ford.play();


		Bike jawa = new Bike();
		jawa.setVehicleType("Two Wheeler");
		jawa.setRegNo("KA05D-6525");
		jawa.setModel("Jawa 42 2.1");
		jawa.setColor("Black");
		jawa.setSuspensionType("Telescopic");

		jawa.showVehicleInfo();

		jawa.start();
		jawa.brake();

		jawa.sideStand();
	

	


	}
}