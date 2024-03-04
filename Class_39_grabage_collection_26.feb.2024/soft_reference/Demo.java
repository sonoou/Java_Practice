import java.lang.ref.SoftReference;

class Appsquadz{

}
public class Demo{
	public static void main(String... s){
		Appsquadz ap=new Appsquadz();//Default reference or strong reference
		System.out.println(ap);
		//Now create soft reference object which ap object is pointing
		SoftReference softap=new SoftReference(ap);
		//Now ap object is eligible for garbage collection, but it will be
		//garbage collected when JVM badly needs memory;
		ap=null;
		System.out.println(ap);
		//the soft referenced, ap object can get back
		ap = (Appsquadz)softap.get();
		System.out.println(ap);
	}
}
