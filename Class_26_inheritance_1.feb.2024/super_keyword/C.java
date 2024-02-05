class C extends B{
	C(){
		super(10);
		//this(10);
		System.out.println("C");
	}
	C(int x){
		//super -> implicit super() inserted by compiler
		System.out.println(x);
	}
	public static void main(String... s){
		new C();
		//new C(12);
	}
}
