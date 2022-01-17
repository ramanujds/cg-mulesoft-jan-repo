class ArraysExample{
	public static void main(String []args){
		
		int []values=new int[5];
		values[0] = 6;
		values[1] = 10;
		values[2] = 20;
		values[3] = 15;
		values[4] = 8;

		// System.out.println("Values are - ");
		
		/*
		for(int index=0; index<values.length; index++){
			System.out.print(values[index]+"\t");
		}
		

		for(int item:values){
			System.out.print(item+"\t");
		}

		*/
		
		int max=values[0];
		int min=values[0];
		for(int item:values){
			if(item>max){
				max=item;
			}
			if(item<min){
				min=item;
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		
	
	}

}