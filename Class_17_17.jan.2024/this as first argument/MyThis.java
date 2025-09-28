class MyThis{
	int x=100;
	void get(MyThis this,int x){
		System.out.println(this+" getkkk");
		System.out.println(this.x);
		System.out.println(x);
	}
	public static void main(String... s){
		MyThis mt=new MyThis();
		System.out.println(mt+" main");
		mt.get(300);
	}
}
