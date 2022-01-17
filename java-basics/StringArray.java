import java.util.Scanner;

class StringArray{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array : ");
		size=scan.nextInt();
		
		String []names = new String[size];
		
		for(int position=0; position<size; position++){
			System.out.print("Enter a name : ");
			names[position] = scan.next()+scan.nextLine();
		}

		System.out.println("Entered Names are : ");

		for(String name:names){
			System.out.print(name+"\t");
		}
	}
}