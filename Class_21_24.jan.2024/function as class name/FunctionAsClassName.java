class FunctionAsClassName{
	FunctionAsClassName(){
		System.out.println("default");
	}
	void FunctionAsClassName(){
		System.out.println("hello");
	}
	public static void main(String... s){
		new FunctionAsClassName().FunctionAsClassName();
	}
}
