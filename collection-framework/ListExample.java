import java.util.*;
class ListExample{
	
	public static void main(String []args){
		
		List<Integer> items = new ArrayList<>();
		
		items.add(10);
		items.add(2);
		items.add(6);
		items.add(8);

		Collections.sort(items);

		items.forEach(item -> System.out.println(item));
		



	/*	

		//Wrapper Class

		items.add(10);
		items.add("Rahul");
		items.add("Harsh");
		items.add(5.76);
		items.add(true);
		items.add(2,"Mahesh");



		Object searchedItem = items.get(2);
		System.out.println("Fetched Item = "+searchedItem);

		int initialSize = items.size();
		System.out.println("Initial Size = "+initialSize);

		items.remove("Harsh");
		Object deletedItem = items.remove(5.76);
		
		System.out.println("Deleted item = "+deletedItem);

		int updatedSize = items.size();
		System.out.println("Updated Size = "+updatedSize);

	
		for(Object obj:items){
			System.out.println(obj);
		}
		
		
		boolean test = items.contains("Javed");

		System.out.println("Value Present - "+test);

		items.forEach(item -> System.out.println(item));

*/
		

		
	}




}