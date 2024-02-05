class Child extends Base{
	int x=20;

	void show(){
		System.out.println("Child");
	}
	void display(){
		System.out.println("Dispay");
	}
	public static void  main(String... s){
		// upcasting
		Base b=new Child();
		b.show();

		// Child c=new Base(); // not allowed

		// downcasting
		Child c=(Child)b;
		c.display();
		b.disp();
	}
}
