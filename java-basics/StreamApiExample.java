import java.util.List;
import java.util.Arrays;
class StreamApiExample{

	public static void main(String []args){
		
		// Find all the even numbers
		// Square those numbers
		// Add the squares

//		int []numbers = {10,5,2,7,4,3};
		List<Integer> nums = Arrays.asList(10,5,2,7,4,3);
		
		int sum = nums.stream().filter(i->i%2==0).map(i->i*i).reduce((x,y)->x+y).get();


/*
		int []evens = new int[numbers.length];
		
		int pos=0;
		for(int i = 0; i<numbers.length; i++){
			if(numbers[i]%2==0){
				evens[pos] = numbers[i];
				pos++;
			}
		}
	
		int []squares = new int[pos];
		
		for(int i = 0; i<pos; i++){
			squares[i] = evens[i]*evens[i];
		}
		
		
		int sum = 0;

		for(int value:squares){
			sum+=value;
		}
		
*/
		System.out.println("Sum = "+sum);
	
	}

}