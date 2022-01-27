package exercises;

import java.util.regex.Pattern;

public class Exercise31 {

	public static void main(String[] args) {
		
		// patternString = "[a-zA-Z0-9+_.]+@[a-zA-Z0-9]+\\.[a-z]+";
		
		String pattern = "[^\\d@#/_][\\w]*[@#/_]+[\\w@#/_]*[0-9a-zA-Z]+{8,}";
		
		String input = "a_@#@";
		
		boolean output = Pattern.matches(pattern, input);
		
		System.out.println(output);
		
		
		

	}

}
