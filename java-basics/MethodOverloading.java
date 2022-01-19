class MathsOperation{
	
	public int add(int a, int b){
		return a+b;
	}

	public int add(int a, int b, int c){
		return a+b+c;
	}

	public float add(float a, float b){
		return a+b;
	}

}

class MethodOverloading{
	public static void main(String []args){
		
		MathsOperation op=new MathsOperation();

		int sum1,sum2;
		float sum3;
		
		sum1 = op.add(5,7);
		sum2 = op.add(12,16,28);
		sum3 = op.add(5.6F, 4.8F);
		
		System.out.println("Sum1 = "+sum1);
		System.out.println("Sum2 = "+sum2);
		System.out.println("Sum3 = "+sum3);
	}
}