class AtClassLevel{
	int x=10;
	int y=20;

	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s){
		AtClassLevel d1=new AtClassLevel();
		d1.show();
		AtClassLevel d2=new AtClassLevel();
		d2.show();
	}
}
