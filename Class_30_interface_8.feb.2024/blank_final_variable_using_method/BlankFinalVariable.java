class BlankFinalVariable{
	final int x;

	int getX(){
		System.out.println(x+" via get function");
		return 10;
	}
	BlankFinalVariable(){
		//x=0;(this line is inserted by the compiler)
		x=getX();
		System.out.println(this.x+" via constructor");
	}
	public static void main(String... s){
		new BlankFinalVariable();
	}
}
