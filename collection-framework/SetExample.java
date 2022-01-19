import java.util.*;
class SetExample{
	public static void main(String []args){
		
		Set items = new TreeSet();
		
		items.add("Rahul");
		items.add("Manoj");
	//	items.add(10);
		items.add("Harsh");
		items.add("Rahul");
		items.add("Manoj");
	//	items.add(10);
	//	items.add(10);


		items.forEach(item -> System.out.println(item));
	}
}
