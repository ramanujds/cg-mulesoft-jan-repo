import java.util.*;
class CountChars{

	public static void main(String []args){
		
		String str = "hello world";

		Map<Character,Integer> charCount = new HashMap<>();

		char []chars = str.toCharArray();

		// 1. scan the characters
		// 2. char is not present - add the char as key and 1 as value
		// 3. char is present - get the current count and add 1 to it


		for(char ch:chars){
			if(!charCount.containsKey(ch)){
				charCount.put(ch,1);
			}
			else{
				int current = charCount.get(ch) + 1;
				charCount.put(ch,current);
			}
			
		}
		
		
//		for(char ch:charCount.keySet()){
//			System.out.println(ch + " -> "+charCount.get(ch));
//		}
		
		charCount.forEach((k,v)->System.out.println(k+" -> "+v));


	}


}