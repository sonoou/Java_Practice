interface My{
	default void show(){
		System.out.println("My");
	}
}

class Child implements My{
	public static void main(String... s){
		My m=new Child();
		m.show();

		Child c=new Child();
		c.show();
	}
}

