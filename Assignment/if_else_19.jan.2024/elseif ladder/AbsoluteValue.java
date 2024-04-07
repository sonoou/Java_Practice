class AbsoluteValue{
	int a;

	void input(){
		System.out.print("Enter a number: ");
		a=new java.util.Scanner(System.in).nextInt();
	}
	void abs(){
		if(a<0){
			a=a*(-1);
		}
		System.out.println("Absolute value is "+a);
	}
	public static void main(String... s){
		AbsoluteValue av=new AbsoluteValue();
		av.input();
		av.abs();
	}
}
