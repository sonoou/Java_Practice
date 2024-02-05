class Child extends Base{
	int x=20;
	int y=30;

	void show(){
		System.out.println(super.x);
		System.out.println(y);
		//System.out.println(super); // error
		System.out.println(((DadaJi)this).x);
		System.out.println(((Base)this).x);
	}
	public static void main(String... s){
		Child c1=new Child();
		c1.show();
	}
}
