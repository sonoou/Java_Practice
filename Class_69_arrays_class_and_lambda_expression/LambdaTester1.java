class LambdaTester1{
	final static String s = "Hello";

	public static void main(String args[]){
		GreetingService greetService1 = message ->
		System.out.println(s + message);
		greetService1.sayMessage("Mahesh");
	}

	interface GreetingService{
		void sayMessage(String message);
	}
}
