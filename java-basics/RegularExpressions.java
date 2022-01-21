import java.util.regex.*;

class RegularExpressions{

 public static void main(String []args){
	
	//	Pattern pattern = Pattern.compile("[abc]*");
		
	//	String input = "";	

	//	Matcher matcher = pattern.matcher(input);

	//	boolean output = matcher.matches();

	//	System.out.println(output);

		String patternString;
		String input;
		boolean output;

	// Either a or b or c
		patternString = "[abc]";

	// Any char except a, b, c
		patternString = "[^abc]";

	// a-z (One or More time)
		patternString = "[a-z]+";
	
	// a-z (Zero or More time)
		patternString = "[a-z]*";

	// a-z including uppercase

		patternString = "[a-zA-Z]*";

	// any char including numbers

		patternString = "[a-zA-Z0-9]*";	
		
		
	
	// RegEx Quantifiers

		// ? - Either only one or zero time

		patternString = "[abc]?";


		// + - One or more time

		// * - Zero or More time

		// {n} - exactly n times

		patternString = "[abc]{3}";

		// {n,} - n or more times

		// {n,m} - at least n times and at max m times


		
		// RegEx Metacharacters

		// \d - a single digit [0-9]

		// \D - non digit [^0-9]

		// \s - a whitespace

		// \S - not a whitespace

		// \w - a word [a-zA-Z0-9]

		// \W - a non word [^a-zA-Z0-9]

		// . - any char
	
		
		// How to write an email pattern with regex

		// tushar@yahoo.com
		
		patternString = "[a-zA-Z0-9+_.]+@[a-zA-Z0-9]+\\.[a-z]+";
		
		input = "aaa@bbb.in";
	
		output = Pattern.matches(patternString,input);

		

		// Writing a pattern for zip code

		patternString = "\\d{6}";
		
		input = "560076";
	
		output = Pattern.matches(patternString,input);

		
		// Writing a pattern for phone number

		patternString = "[^0]\\d{9}";
		
		input = "1000000000";
	
		output = Pattern.matches(patternString,input);

		System.out.println(output);

	
	}
}

