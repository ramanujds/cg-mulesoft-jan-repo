import java.util.stream.*;
import java.util.*;

class StreamApi{
	
	public static void main(String []args){
	
		// Creating a Stream
		// Method 1
		
		// Stream<Integer> numStream = Stream.of(10,15,20,25,30);
		// numStream.forEach(item->System.out.println(item));
		
		//Method 2
		List<String> namesList = Arrays.asList("Harsh","Rohit","Kumar","Javed","Priya","Rajesh","Hirak");

		Stream<String> namesStream = namesList.stream();

		// namesStream.forEach(item->System.out.println(item));

		// Filtering Data

		// Find out the names that starts with "R"
		
		// namesStream.filter(name -> name.startsWith("R")).forEach(name->System.out.println(name));
		
		// Mapping Data

		// Convert all the names to uppercase

		// namesStream.map(name->name.toUpperCase()).forEach(name->System.out.println(name));

		// Find all the names that starts with "H" and convert them to upper case

		// namesStream.map(name->name.toUpperCase())
		//			.filter(name -> name.startsWith("H"))
		//			.forEach(name->System.out.println(name));

		// Find all the names that contains "r" and display them in a sorted order

		// namesStream.filter(name->name.toLowerCase().contains("r"))
		//			.sorted((s1,s2)->s2.compareTo(s1))
		//			.forEach(name->System.out.println(name));


		// Terminal Operations
		
		List<Integer> nums = Arrays.asList(10,3,2,6,7,4);

		// Find all the even numbers and add them

		// int result = nums.stream().filter(n->n%2 == 0).reduce(0,(sum,n)->sum+n);
 
		// Find all the even numbers, square them and add them

		// int result = nums.stream().filter(n->n%2 == 0)
		//					.map(n->n*n)
		//				  	.reduce(0,(sum,n)->sum+n);


		// int result = nums.stream().filter(n->n%2 == 0)
		//					.mapToInt(n->n*n)
		//				  	.sum();

		// Find all the odd numbers, square them and find the minimum
		int result = nums.stream().filter(n->n%2 != 0)
							.mapToInt(n->n*n)
						  	.min().getAsInt();		
	
		// System.out.println(result);

		// Collect all the names that srats with R to another list
		
		List<String> rList = namesList.stream().filter(name -> name.startsWith("R"))
							.collect(Collectors.toList());

		rList.forEach(System.out::println);
		
		
	
	}

}