// A lambda expression is a kind of an anonymous function. its a method
// without a declaration i.e., access modifier, return value declaration
// ,and name.
// Lambda expression eliminates the need of anonymous class and gives
// a very simple yet powerful functional programming capability to Java.
// Lambda expressions in Java is usual written using syntax
// (argument) -> (body)

import java.lang.reflect.*;
import java.util.function.*;

public class Calculator{
	public int operateBinary(int a, int b, IntegerMath op){
		return op.operation(a,b);
	}
	public static void main(String args[])throws Exception{
		Calculator myApp = new Calculator();
		IntegerMath addition = (int a, int b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;

		Class c = subtraction.getClass();
		if(c.isInterface()){
			System.out.println("It is a interface");
		}
		else if(c.isPrimitive()){
			System.out.println("It is a Primitive");
		}
		else if(c.isArray()){
			System.out.println("It is a Array");
		}
		else{
			System.out.println("It is a class");
		}
		System.out.println(c.getName());

		Class in[] = c.getInterfaces();
		for(Class t : in){
			System.out.println(t.getName());
		}

		Method m = c.getDeclaredMethod("operation",int.class,int.class);
		System.out.println(m.getName());
		System.out.println("40 + 2 = "+myApp.operateBinary(40,2,addition));
		System.out.println("20 - 10 = "+myApp.operateBinary(20,10,subtraction));
	}
}

@FunctionalInterface
interface IntegerMath{
	int operation(int a, int b);
}
