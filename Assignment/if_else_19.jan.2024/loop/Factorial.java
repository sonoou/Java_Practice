class Factorial{
	int a;
	int f=1;

	void input(){
		System.out.print("Enter a  number: ");
		a=new java.util.Scanner(System.in).nextInt();
	}

	void fact(){
		for(int i=1;i<=a;i++){
			f*=i;
		}
		System.out.println("Factorial of "+a+" is "+f);
	}
	public static void main(String... s){
		Factorial f=new Factorial();
		f.input();
		f.fact();
	}
}
