class StringManipulation{
	public static void main(String []args){
		String str1="Hello";
		String str2="hello";

		int length = str1.length(); 

		char []charArr=str1.toCharArray();
		
		for(char ch:charArr){
			System.out.print(ch+"  ");
		}
		System.out.println();

		int difference = str1.compareTo(str2);

		int index = str1.indexOf("l");
		System.out.println("index of l is "+index);
		
		char ch = str1.charAt(4);
		System.out.println("Char at 4th index = "+ch);
		
		

		System.out.println("Difference = "+difference);
		
		System.out.println("Length of Str1 = "+length);
		boolean isEqual = str1.equalsIgnoreCase(str2);

		System.out.println(isEqual);
	}
}
