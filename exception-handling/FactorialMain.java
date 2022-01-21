class FactorialMain{
	public static void main(String []args){
		FactorialFinder facto = new FactorialFinder();
		try{
		int result = facto.findFactorial(-5);

		System.out.println("Factorial = "+result);
		}
		catch(InvalidNumberException ex){
			ex.printStackTrace();
		}
	
	}

}