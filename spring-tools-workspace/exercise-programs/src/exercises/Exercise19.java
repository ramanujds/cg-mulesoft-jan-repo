package exercises;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []inputArr = {"2AA","12","ABC","c1a"};
		
		int sum = 0;
		for(String str:inputArr) {
			String []value = str.split("[a-zA-Z]");
			for(String num:value) {
				int length = num.length();
				if (length>0) {
					for(int i=0; i<length; i++) {
						sum += Integer.parseInt(String.valueOf(num.charAt(i)));
					}
				}
	
		}
		
		
		}
		
		System.out.println(sum);

	}

}
