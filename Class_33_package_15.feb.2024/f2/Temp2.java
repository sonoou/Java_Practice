package p2;

import p1.Temp1;

class Temp2{
	void show(){
		System.out.println("package p2");
	}
	public static void main(String... s){
		Temp1 t1=new Temp1();
		t1.show();

		Temp2 t2=new Temp2();
		t2.show();
	}
}
