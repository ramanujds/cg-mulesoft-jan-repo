interface Enemy{
	
	void attack();	

	default void destroy(){
		System.out.println("Destroyed by Enemy");
	}

	static void showInfo(){
		System.out.println("I am an Enemy");
	}

}