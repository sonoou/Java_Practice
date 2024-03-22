class Gen<T>{
	T ob;
	Gen(T o){
		ob = o;
	}
	//Return ob;
	T getob(){
		return ob;
	}
}
//A subclass of gen.
class Gen2<T> extends Gen<T>{
	Gen2(T o){
		super(o);
	}
}

//DemoStrate runtime type ID implications of generic class hierarchy.
public class HierDemo3{
	public static void main(String args[]){
		//Create a gen object for Integers.
		Gen<Integer> iOb = new Gen<Integer>(88);
		//Create a Gen2 object for Intergers
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		//Create a Gen2 object for Strings.
		Gen2<String> strOb2 = new Gen2<String>("Generics Test");

		if(iOb2 instanceof Gen2<?>){
			System.out.println("iOb2 is instanceof Gen2");
		}
		if(iOb2 instanceof Gen<?>){
			System.out.println("iOb2 is instanceof Gen");
		}
		System.out.println(); 

		if(strOb2 instanceof Gen2<?>){
			System.out.println("strOb is instance of Gen2");
		}
		if(strOb2 instanceof Gen<?>){
			System.out.println("strOb is instance of Gen");
		}

		//See if iOb is an instance of Gen2, which
		//is not
		if(iOb instanceof Gen2<?>){
			System.out.println("iOb is instanceof Gen2");
		}

		//See if iOb is an instance of Gen2, which
		//it is
		if(iOb instanceof Gen<?>){
			System.out.println("iOb is instanceof Gen");
		}
		// The following can't be compiled because
		// generic type info does not exist ar runtime.
		// if(iOb2 instanceof Gen2<Integer>){
		// 		System.out.println("iOb2 is instanceof Gen2<?>);
		// }
	}
}
