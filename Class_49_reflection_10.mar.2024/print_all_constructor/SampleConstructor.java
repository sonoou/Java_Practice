import java.lang.reflect.*;
import java.awt.*;

class SampleConstructor{
	public static void printConstructor(Object o){
		Class c = o.getClass();
		Constructor cs[] = c.getConstructors();

		for(int i=0;i<cs.length;i++){
			System.out.print(c.getName()+"( ");
			Class type[] = cs[i].getParameterTypes();
			for(int j=0;j<type.length;j++){
				System.out.print(type[j].getName()+", ");
			}
			System.out.println(" )");
		}

	}
	public static void main(String... s){
		Thread t = new Thread("ss");
		//String s1 = new String("hh");
		printConstructor(t);
	}
}
