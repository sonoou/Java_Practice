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

interface My2{
	default void show(){
		System.out.println("My2");
	}
}

class Child implements My2{
	public static void main(String... s){
		My2 m2=new Child();
		m2.show();
	}
}
