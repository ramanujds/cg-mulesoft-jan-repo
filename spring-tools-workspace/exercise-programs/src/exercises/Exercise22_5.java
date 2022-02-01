package exercises;

public class Exercise22_5 {

	public static void main(String[] args) {
		
		String str = "helloworld";
		
		StringBuilder sb=new StringBuilder("");
		
		for(char ch:str.toCharArray()) {
			if(sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}

}
