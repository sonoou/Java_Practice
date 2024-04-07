class Reversed{
	int a;
	int r=0;
	void input(){
		System.out.print("Enter a number: ");
		a=new java.util.Scanner(System.in).nextInt();
	}
	void rev(){
		int d;
		while(a>0){
			d=a%10;
			r=r*10+d;
			a/=10;
		}
		System.out.println("Reverse is "+r);
	}
	public static void main(String... s){
		Reversed r=new Reversed();
		r.input();
		r.rev();
	}
}
