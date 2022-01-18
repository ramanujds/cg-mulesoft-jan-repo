import vehicles.cars.Car;
class CarProgram{
	public static void main(String []args){
		
		Car ford = new Car("MH10D-2876","Ford Figo", "Black");
		Car.vehicleType = "Four Wheeler";
//		ford.setRegNo("KA05A-2025");
//		ford.setModel("Ford Eco-Sprots");
//		ford.setColor("White");

		ford.showCarInfo();

		ford.start();
		ford.brake();


		Car tata = new Car("DL10C-2476","TATA Nexon", "Red");
		

		tata.showCarInfo();

		tata.start();
		tata.brake();


	}
}