class FindSquare{
	int a;
	int b;

	void input(){
		System.out.print("Enter a number: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter b number: ");
		b=new java.util.Scanner(System.in).nextInt();
	}
	void find(){
		int result=1;
		for(int i=1;i<=b;i++){
			result*=a;
		}
		System.out.println("Square is "+result);
	}
	public static void main(String...  s){
		FindSquare fs=new FindSquare();
		fs.input();
		fs.find();
	}
}
