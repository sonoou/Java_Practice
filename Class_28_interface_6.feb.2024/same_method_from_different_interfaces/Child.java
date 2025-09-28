interface My{
	void show();
}

interface My1{
	void show();
}

class Child implements My, My1{
	public void show(){
		System.out.println("Show from two different interfaces");
	}
	public static void main(String... s){
		My m=new Child();
		m.show();

		My1 m1=new Child();
		m1.show();
	}
}
