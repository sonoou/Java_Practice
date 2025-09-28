class Temp{
	int x=getX();

	int  getX(){
		System.out.println("getX start");
		System.out.println(x);
		return 10;
	}
	Temp(){
		//x=0;
		//x=getX();
		System.out.println(x);
		System.out.println("Default end");
	}
	public static void main(String... s){
		Temp t=new Temp();
	}
}

