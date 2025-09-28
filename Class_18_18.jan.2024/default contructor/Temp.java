class  Temp{
	int x;
	int y;
	Temp(){
		x=10;
		y=20;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		Temp t1=new Temp();
		t1.show();

		Temp t2=new Temp();
		t2.show();
	}
}
