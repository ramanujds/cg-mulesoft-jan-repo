interface MathOperation{
	int calculate(int x, int y);
}		






class Calculator{

	public static void main(String []args){

		MathOperation addOperation = (x,y)->x+y;
	
		int result = addOperation.calculate(10,15);
	
	
		System.out.println("Result = "+result);


		MathOperation multiplyOperation = (x,y)->x*y;
	
		result = multiplyOperation.calculate(10,15);
	
	
		System.out.println("Result = "+result);


		MathOperation findLargestOperation = (x,y)->{
													if(x>y){
														return x;
														}
													return y;
												};
	
		result = findLargestOperation.calculate(10,15);
	
	
		System.out.println("Largest = "+result);
		

	
	}


}