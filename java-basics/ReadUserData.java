import java.util.Scanner;

class ReadUserData{

	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		String name;
		int number;

		System.out.println("Enter your name : ");

		name = scan.nextLine();



		System.out.println("Enter a number : ");
		
		number = scan.nextInt();

		System.out.println("Hello "+name+",");

		System.out.println("Entered Number is "+number); 
	
	
	}

}