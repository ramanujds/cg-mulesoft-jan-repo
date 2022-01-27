package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,3,2,4,6,1);
		
		
		int result = numbers.stream().filter(num -> num%2==0)
									 .map(num -> num*num)
									 .reduce((sum,num)->sum+num)
									 .orElse(0);
		
		System.out.println("Result = "+result);

	}

}
