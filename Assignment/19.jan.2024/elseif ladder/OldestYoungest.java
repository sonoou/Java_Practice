class OldestYoungest{
	int a;
	int b;
	int c;

	void input(){
		System.out.print("Enter first person's age: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter second person's age: ");
		b=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter third person's age: ");
		c=new java.util.Scanner(System.in).nextInt();
	}
	void greaterAge(){
		if(a>b && a>c){
			System.out.println("\nfirst person is oldest");
			if(b>c){
				System.out.println("third person is youngest");
			}
			else{
				System.out.println("second person is youngest");
			}
		}
		else if(b>a && b>c){
			System.out.println("\nsecond person is oldest");
			if(a>c){
				System.out.println("third person is youngest");
			}
			else{
				System.out.println("first person is youngest");
			}
		}
		else{
			System.out.println("\nthird person is oldest");
			if(b>a){
				System.out.println("first person is youngest");
			}
			else{
				System.out.println("second person is youngest");
			}
		}
	}
	public static void main(String... s){
		OldestYoungest oy=new OldestYoungest();
		oy.input();
		oy.greaterAge();
	}
}
