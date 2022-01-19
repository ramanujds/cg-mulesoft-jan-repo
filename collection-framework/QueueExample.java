import java.util.*;
class QueueExample{

	public static void main(String []args){
		
		Queue myQueue = new PriorityQueue();
		
		myQueue.add("Rahul");
		myQueue.add("Suraj");
		myQueue.add("Amit");
		myQueue.add("Priya");


		while(!myQueue.isEmpty()){
			System.out.println(myQueue.remove());
		}
		
	
	}

}