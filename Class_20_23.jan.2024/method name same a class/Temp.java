class Temp{
	Temp(){
		System.out.println("default");
	}
	void Temp(){
		System.out.println("hello");
	}
	public static void main(String... s){
		new Temp().Temp();
	}
}
