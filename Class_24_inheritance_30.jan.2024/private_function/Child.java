class Child extends Base{
	private void show(){
		System.out.println("Child");
	}
	public static void main(String... s){
		Child c1=new Child();
		c1.show();
	}
}
