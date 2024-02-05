class Child extends Base{
	//primitive data types are not allowed as return type
	B show(){
		System.out.println("Child");
		super.show();
		return new B();
	}
	public static void main(String... s){
		Child c1=new Child();
		c1.show();
	}
}
