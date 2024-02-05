class SameArguments{
	static void show(int x,long f){
		System.out.println("int long arguments");
	}
	static void show(long x,int z){
		System.out.println("long int arguments");
	}
	public static void main(String... s){
		//show(10,10L);//int long
		//show(10L,10);//long int
		show(10,10);//error
	}
}
