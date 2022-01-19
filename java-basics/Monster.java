class Monster implements Enemy, Villain{

	public void attack(){
		System.out.println("Attacked by Monster..");
	}
	
	public void destroy(){
		System.out.println("Destroyed 70%");
		harm();
	}

	public void harm(){
		System.out.println("Harmed...");
	}

}