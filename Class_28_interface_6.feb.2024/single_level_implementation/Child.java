interface My{
	void show();
}
class Child implements My{
	public static void main(String...s){
		Child c1=new Child();
		MyRegister mr=new MyRegister();
		mr.register(c1);
	}
	public  void show(){
		System.out.println("Show");
	}
}
class MyRegister{
	void register(My m){
		m.show();
	}
}
