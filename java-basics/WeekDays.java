import java.util.Scanner;

class WeekDays{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a day in number");
		int day=scan.nextInt();
		switch(day){
			case 1:
				System.out.println("Mon Day");
				break;
			case 2:
				System.out.println("Tues Day");
				break;
			case 3:
				System.out.println("Wednes Day");
				break;
			case 4:
				System.out.println("Thurs Day");
				break;
			case 5:
				System.out.println("Fri Day");
				break;
			case 6:
				System.out.println("Satur Day");
				break;
			case 7:
				System.out.println("Sun Day");
				break;
	
			default:
				System.out.println("Invalid Day");
				break;
		}
	}
}