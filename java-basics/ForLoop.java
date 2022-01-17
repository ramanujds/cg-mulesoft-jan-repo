class ForLoop{
	public static void main(String []args){
		
		int num = 10;
		boolean isPrime=true;

		for(int n=2; n<=num-1; n++){
			if(num%n==0){
				isPrime=false;
				break;
			}
		}

		if(isPrime){
			System.out.println("Number is Prime");
		}	
		else{
			System.out.println("Number is Not Prime");
		}
		
	}
}
