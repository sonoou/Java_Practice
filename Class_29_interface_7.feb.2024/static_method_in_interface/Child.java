interface My{
	static void show(){
		System.out.println("My");
	}
}

class Child implements My{
	public static void main(String... s){
		My.show();
		System.out.println("static method of interface can");
		System.out.println("only be accesed by interface name.");
		System.out.println("and they are never inheritate");
	}
}
