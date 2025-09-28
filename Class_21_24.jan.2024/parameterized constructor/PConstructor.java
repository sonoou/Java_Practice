class PConstructor{
	int x;
	int y;

	PConstructor(int x,int y){
		this.x=x;
		this.y=y;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		PConstructor d1=new PConstructor(10,20);
		d1.show();
		PConstructor d2=new PConstructor(100,200);
		d2.show();
	}
}
