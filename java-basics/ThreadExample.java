
class ThreadExample{

	public static void main(String []args){
		Runnable r1= () -> System.out.println("Hello..");
		Thread thread1 = new Thread(r1);
		thread1.start();
	}

}