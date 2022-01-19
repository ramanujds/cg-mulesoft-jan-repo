interface MyInterface{
	void show();	
}


class AnonymousExample{
			
	public static void main(String []args){
		
			MyInterface obj = new MyInterface(){
				
				public void show(){
					System.out.println("Hi.. How are you?");
				}

				
				
			};



			obj.show();
			
	}	

}
