class Greatest{
	int a;
	int b;

	void input(){
		System.out.print("Enter number a: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter number b: ");
		b=new java.util.Scanner(System.in).nextInt();
	}
	void checkGreater(){
		if(a>b){
			System.out.println("a is greater");
		}
		else if(b>a){
			System.out.println("b is greater");
		}
		else{
			System.out.println("both are equal");
		}
	}
	public static void main(String... s){
		Greatest g=new Greatest();
		g.input();
		g.checkGreater();
	}
}
