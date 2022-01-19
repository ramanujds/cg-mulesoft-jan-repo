interface MyInterface{
	void show();	
}


interface Printable{
	void print(int x);
	default void foo(){
		System.out.println("Hello World");
	}
}
	
	

class LambdaExpression{
			
	public static void main(String []args){
		
		MyInterface obj = ()-> System.out.println("Hi.. How are you?");
		obj.show();
		
		Printable printObj = x -> System.out.println("Value = "+x);
		printObj.print(15);
		
			
	}

	

}
