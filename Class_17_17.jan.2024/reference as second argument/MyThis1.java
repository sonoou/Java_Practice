class MyThis1{
	int x=10;
	void get(int x,MyThis1 z){
		System.out.println(x);
		System.out.println(z.x);
	}

	public static void main(String s[]){
		MyThis1 mt=new MyThis1();
		System.out.println(mt.x);
		mt.get(20,mt);
	}
}
