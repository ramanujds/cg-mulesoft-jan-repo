class FactorialFinder{

	public int findFactorial(int num)throws InvalidNumberException{
		if(num<0){
			throw new InvalidNumberException("Negative nos are not allowed");
		}
		
		int factorial=1;
		while(num>0){
			factorial*=num;
			num--;
		}
		return factorial;	
	}

}