import java.lang.reflect.*;
import java.awt.*;

class SampleMethods{
	public static void printMethods(Object o){
		Class c = o.getClass();
		Method m[] = c.getMethods();

		for(int i=0;i<m.length;i++){
			Class r = m[i].getReturnType();// return type class object
			System.out.print(r.getName());// print return type

			System.out.print(" "+m[i].getName()+"( ");// method name

			Class param[] = m[i].getParameterTypes();
			for(int j=0;j<param.length;j++){
				System.out.print(param[j].getName()+", ");
			}
			System.out.println(" )");
		}
	}
	public static void main(String... args){
		String s = new String("ss");
		printMethods(s);
	}
}
