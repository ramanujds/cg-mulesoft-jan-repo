package exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise35 {

	public static void main(String[] args) {
		
		String str = "welcome to Java Exercise everyone";
		
		List<String> words = Arrays.asList(str.split(" "));
		
		String max = words.stream()
						.max((s1,s2)-> s1.length()-s2.length()==0?(s1.compareTo(s2)):s1.length()-s2.length()
								).get();
		
		System.out.println(max);

	}

}
