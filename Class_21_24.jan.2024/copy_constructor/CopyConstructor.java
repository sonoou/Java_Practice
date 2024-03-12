class CopyConstructor{
	int x;
	int y;

	CopyConstructor(int x,int y){
		this.x=x;
		this.y=y;
	}
	CopyConstructor(CopyConstructor z){
		this.x=z.x;
		this.y=z.y;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		CopyConstructor c1=new CopyConstructor(10,20);
		c1.show();
		CopyConstructor c2=new CopyConstructor(c1);
		c2.show();
	}
}
