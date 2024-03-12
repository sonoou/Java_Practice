class Temp{
	private final int x;
	Demo d;
	private Temp(int x){
		d=new Demo();
		this.x=x;
	}
	void show(){
		System.out.println(x);
	}
	public static Temp getInstance(int z){
		return new Temp(z);
	}
}

class Demo{
	public static void main(String... s){
		Temp t = Temp.getInstance(10);
		t.show();
	}
}
