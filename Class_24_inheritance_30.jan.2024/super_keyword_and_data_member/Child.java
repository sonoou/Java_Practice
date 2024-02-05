class Child extends Base{
	int x=20;
	int y=20;

	void show(){
		System.out.println("\nfrom show");
		System.out.println(x);
		System.out.println(super.x);
		//System.out.println(super); // error
		System.out.println(((DadaJi)this).x);
		System.out.println(((Base)this).x);
	}
	public static void main(String... s){
		Child c1=new Child();
		c1.show();
		System.out.println("\nfrom main");
		System.out.println(c1.x);
		System.out.println("We can not use super in static method");
		System.out.println(((DadaJi)c1).x);
		System.out.println(((Base)c1).x);
	}
}
