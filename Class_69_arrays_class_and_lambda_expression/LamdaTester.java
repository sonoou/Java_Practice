// If you define lambda expression without curly braces then you can give
// only single line in method body.
// If you define lambda expression with curly braces then you can give
// multiple line in method body.
// Lambda expression are used primarily to define inline implementation of
// a functional interface, i.e., an interface with a single method only.

import java.util.function.*;

public class LamdaTester{
	public static void main(String args[]){
		LamdaTester tester = new LamdaTester();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;
		//with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {return a*b;};
		//without return statement along with curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = "+tester.operate(10,5,addition));
		System.out.println("10 - 5 = "+tester.operate(10,5,subtraction));
		System.out.println("10 x 5 = "+tester.operate(10,5,multiplication));
		System.out.println("10 / 5 = "+tester.operate(10,5,division));

		GreetingService greetService1 = message ->
		System.out.println("Hello "+message);

		GreetingService greetService2 = (message) -> {
			System.out.println("Hello "+message);
			System.out.println("Hay "+message);
		};
		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
	}
	@FunctionalInterface
	interface MathOperation{
		int operation(int a, int b);
	}
	@FunctionalInterface
	interface GreetingService{
		void sayMessage(String message);
		static void show(){}
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}
}
