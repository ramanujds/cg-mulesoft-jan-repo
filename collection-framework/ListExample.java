import java.util.*;
class ListExample{
	
	public static void main(String []args){
		
		List items = new ArrayList();
		
		items.add(10);
		items.add("Rahul");
		items.add("Harsh");
		items.add(5.76);
		items.add(true);
		items.add(2,"Mahesh");

		int initialSize = items.size();
		System.out.println("Initial Size = "+initialSize);

		items.remove("Harsh");
		Object deletedItem = items.remove(5.76);
		
		System.out.println("Deleted item = "+deletedItem);

		int updatedSize = items.size();
		System.out.println("Updated Size = "+updatedSize);

	/*
		for(Object obj:items){
			System.out.println(obj);
		}
	*/	
		
		boolean test = items.contains("Javed");

		System.out.println("Value Present - "+test);

		items.forEach(item -> System.out.println(item));
		

		
	}




}