interface My{
	void show();
}
interface My1{
	void display();
}
class Child implements My,My1{
	public void show(){
		System.out.println("Show");
	}
	public void display(){
		System.out.println("Display");
	}
	public static void main(String... s){
		My m=new Child();
		m.show();

		My1 m1=new Child();
		m1.display();
	}
}
