import java.lang.ref.WeakReference;

class Appsquadz{

}

public class Demo{
	public static void main(String... s){
		Appsquadz ap=new Appsquadz();//Default or Strong Reference
		System.out.println(ap);
		//Now  create Weak Reference object to which ap object is pointing
		WeakReference weakap=new WeakReference(ap);
		//Now ap object is eligible for garbage collection, but it will be remove
		//from memory when JVM needs memory
		ap=null;
		System.out.println(ap);
		//Weakly reference ap object can get back
		ap=(Appsquadz)weakap.get();
		System.out.println(ap);
	}
}

