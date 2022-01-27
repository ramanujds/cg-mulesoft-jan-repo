package lambdaexpression;

interface Showable{
	public void show();
}

//class ShowClass implements Showable{
//	
//	@Override
//	public void show() {
//		System.out.println("Hello World");
//		
//	}
//}

interface StringOperation{
	
	public boolean checkCredentials(String username, String password);
	
}

public class LambdaExpression {

	public static void main(String[] args) {
		
//		Showable obj = new ShowClass();
		
		Showable obj = ()-> System.out.println("Hello World");
	
		obj.show();
		
		String username = "tushar";
		String password = "pass1234";
		
		StringOperation op = (user,pass)->user.equals(username) && pass.equals(password);
										
		
		boolean authenticated = op.checkCredentials("tushar", "pass1234");
		
		System.out.println(authenticated);
								
		
	}

}
