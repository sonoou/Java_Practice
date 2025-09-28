import java.lang.reflect.Constructor;

class Temp{
	private Temp(){
		System.out.println("Default constructor");
	}
	void show(){
		System.out.println("show");
	}
	private Temp(int x){
		System.out.println(x+" via parameterize constructor");
	}
}

class PrivateConstructor{
	public static void main(String... args){
		try{
			//Temp t1 = new Temp();
			Class cl = Temp.class;

			Constructor c = cl.getDeclaredConstructor();
			c.setAccessible(true);
			Temp t1 = (Temp)c.newInstance();
			t1.show();

			Constructor c1 = cl.getDeclaredConstructor(int.class);
			c1.setAccessible(true);
			Temp t2 = (Temp)c1.newInstance(10);
			t2.show();
		}
		catch(Exception e){
			//empty
		}
	}
}
