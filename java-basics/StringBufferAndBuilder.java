class StringBufferAndBuilder{
	public static void main(String []args){
		String str = "rahul";

		StringBuilder revStr = new StringBuilder(str);
		
		int length = str.length();

		for(int i=0, j=length-1 ; i<length; i++, j--){
			
			revStr.setCharAt(i,str.charAt(j));
		}

		System.out.println("Reverse = "+revStr);
		
		
	}
}