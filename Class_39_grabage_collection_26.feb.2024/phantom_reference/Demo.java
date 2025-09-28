import java.lang.ref.ReferenceQueue;
import java.lang.ref.PhantomReference;

class Appsquadz{

}
public class Demo{
	public static void main(String... s){
		Appsquadz ap=new Appsquadz();//Default reference or strong reference
		System.out.println(ap);
		//Now create Reference Queue object
		ReferenceQueue refq=new ReferenceQueue();
		//Create Phantom Reference object to which ap object is pointing
		PhantomReference phantomap=new PhantomReference(ap,refq);
		//Now ap object is eligible for garbage collection, but it will be kept
		//in 'refq' before removing
		ap = null;
		System.out.println(ap);
		//to get back object which has been Phantom referenced return null
		ap = (Appsquadz)phantomap.get();
		System.out.println(ap);
	}
}
