	class SumLoop{
	int a;
	int b;

	void input(){
		System.out.print("\n Enter first number: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print(" Enter second number: ");
		b=new java.util.Scanner(System.in).nextInt();
	}
	void sum(){
		int sum;
		sum=a+b;
		System.out.println(" Sum is "+sum);
	}
	public static void main(String... s){
		int n=1;
		SumLoop sl=new SumLoop();
		do{
			sl.input();
			sl.sum();
			System.out.print("\n Press 1 for continue, 0 for not: ");
			n=new java.util.Scanner(System.in).nextInt();
		}while(n==1);
	}
}
