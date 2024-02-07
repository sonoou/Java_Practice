interface My{
	default void show(){
		System.out.println("My");
	}
}
interface My1{
	default void show(){
		System.out.println("My1");
	}
}

class Child implements My, My1{
	public static void main(String... s){
		My m=new Child();
		m.show();

		My1 m1=new Child();
		m1.show();
	}
	public void show(){
		System.out.println("Note: If same instance methods are coming\nfrom two different interface then child class has to override that method");
	}
}
