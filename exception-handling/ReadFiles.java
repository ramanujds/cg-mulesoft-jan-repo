import java.io.*;
import java.util.Scanner;
class ReadFiles{
	public static void main(String []args){

	try{
		FileReader reader = new FileReader("hello1.txt");
		Scanner scan = new Scanner(reader);
		String line = scan.nextLine();
		System.out.println("Content of the file - ");
		System.out.println(line);
	}
	catch(FileNotFoundException ex){
		System.err.println(ex.getMessage());
	}		

	}
}