interface My{
	void show();
}

interface My1 extends My{
	void display();
}

interface My2 extends My1{
	void xyz();
}

class Child implements My2{
	public void show(){
		System.out.println("Show");
	}
	public void display(){
		System.out.println("Display");
	}
	public void xyz(){
		System.out.println("xyz");
	}
	public static void main(String... s){
		My2 m=new Child();
		m.show();
		m.display();
		m.xyz();
	}
}
