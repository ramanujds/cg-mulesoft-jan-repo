class ExceptionHandling{
	public static void main(String []args){

		int x=10, y=0;

		System.out.println("Hello Everyone..");

		try{
			int div = x/y;
			System.out.println("Div = "+div);
		}
		catch(ArithmeticException ex){
			System.err.println("Error!! "+ex.getMessage());
		}

		System.out.println("Program Execution Completed");
				
		System.out.println("Bye.....");

	}
}