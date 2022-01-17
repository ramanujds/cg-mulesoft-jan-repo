class ArraySorting{
		public static void main(String []args){
			
			int []numbers={6,2,7,9,8};

			System.out.println("Before Sorting : ");
			for(int num:numbers){
				System.out.print(num+"\t");
			}
			      
			for(int i=0; i<numbers.length; i++){
				for(int j=i+1; j<numbers.length; j++){
					if(numbers[i]>numbers[j]){
						int temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("After Sorting : ");
			for(int num:numbers){
				System.out.print(num+"\t");
			}
	}
}


			