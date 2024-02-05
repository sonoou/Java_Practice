class C extends B{
	C(){
		this(10);
		System.out.println("C");
	}
	C(int x){
		super();
		System.out.println(x);
	}
	public static void main(String... s){
		new C();
		new C(20);
	}
}
