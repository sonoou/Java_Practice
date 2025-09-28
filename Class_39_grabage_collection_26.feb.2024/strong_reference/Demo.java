class Appsquadz{

}
public class Demo{
	public static void main(String... s){
		Appsquadz ap=new Appsquadz();//Default reference or strong reference
		System.out.println(ap);
		ap=null;//Now object ap pointing to null and is available for garbage
				//collection
		System.out.print(ap);
	}
}
