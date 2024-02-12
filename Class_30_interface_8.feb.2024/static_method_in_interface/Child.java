interface My{
	static void show(){
		System.out.println("My");
	}
}
class Child /* implements My */ {
	public static void main(String... s){
		My.show();
	}
}
