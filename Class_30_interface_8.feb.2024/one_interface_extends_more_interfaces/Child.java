interface My{
	void show();
}
interface My1{
	void display();
}
interface My2 extends My,My1{
	void xyz();
}
class Child implements My2{
	public void show(){
		System.out.println("show");
	}
	public void display(){
		System.out.println("display");
	}
	public void xyz(){
		System.out.println("xyz");
	}
	public static void main(String... s){
		My2 m2=new Child();
		m2.show();
		m2.display();
		m2.xyz();
	}
}
