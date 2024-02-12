interface My{
	void show();
}

class Temp{
	public void show(){
		System.out.println("Temp");
	}
}

class Child extends Temp implements My{
	public String toString(){
		return "Hello";
	}
	public static void main(String... s){
		My m=new Child();
		m.show();
		System.out.println(m.toString());
	}
}
