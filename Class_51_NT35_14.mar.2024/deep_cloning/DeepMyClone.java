class Temp implements Cloneable{
	int g;
	Temp(int g){
		this.g=g;
	}
	public Temp clone(){
		try{
			return (Temp)super.clone();
		}
		catch(Exception e){
			return null;
		}
	}
}

class DeepMyClone implements Cloneable{
	int x=10;
	Temp t;
	DeepMyClone(int a){
		t = new Temp(a);
	}
	public DeepMyClone clone(){
		//deep clone
		try{
			DeepMyClone d = (DeepMyClone)super.clone();
			d.t = t.clone();//deep copy is created by this line
			return d;
		}
		catch(Exception e){
			return null;
		}
	}
	public static void main(String... s){
		DeepMyClone c=null;
		DeepMyClone m=new DeepMyClone(100);
		System.out.println("m "+m.t.g);
		try{
			c = m.clone();
			//or if not override the clone() method
			//c = (Demo)m.clone();
			//c.t = m.t.clone();
		}
		catch(Exception e){
			//empty
		}
		System.out.println("c "+c.t.g);
		c.t.g = 300;
		System.out.println("m after changes "+m.t.g);
		if(m.t!=c.t){
			System.out.println("Deep cloning");
		}
	}
}
