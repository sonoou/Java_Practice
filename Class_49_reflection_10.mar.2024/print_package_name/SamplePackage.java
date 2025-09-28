import java.lang.reflect.*;
import java.awt.*;

class SamplePackage{
	static void printPackage(Object o)throws Exception{
		Class c = o.getClass();
		//Class c = Class.forName("java.io.Serializable");
		//Class c = java.io.Serializable.class;
		Package p = c.getPackage();
		System.out.println(p.getName());
	}
	public static void main(String args[])throws Exception{
		String s = new String("ss");
		printPackage(s);
	}
}
