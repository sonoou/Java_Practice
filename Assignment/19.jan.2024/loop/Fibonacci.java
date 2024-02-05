class Fibonacci{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void fibo(){
		int a=0;
		int b=1;
		int sum;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=n;i++){
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}
	public static void main(String... s){
		Fibonacci f=new Fibonacci();
		f.input();
		f.fibo();
	}
}
