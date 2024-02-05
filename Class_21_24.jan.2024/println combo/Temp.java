class Temp{
	static Demo d;
	static{
		System.out.println("static block form Temp");
		d=new Demo();
	}
}

class Demo{
	void show(int x){
		System.out.println(x);
	}
}

class Temp1{
	public static void main(String... s){
		System.out.println("main from Temp1");
		Temp.d.show(10);
	}
}
