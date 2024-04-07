class EvenOddSum{
	int a;
	int even=0;
	int odd=0;

	void input(){
		System.out.print("Enter total number of integer: ");
		a=new java.util.Scanner(System.in).nextInt();
	}
	void sum(){
		int n;
		for(int i=1;i<=a;i++){
			System.out.print("Enter the "+i+" integer value: ");
			n=new java.util.Scanner(System.in).nextInt();

			if((n%2)==0){
				even+=n;
			}
			else{
				odd+=n;
			}
		}
		System.out.println("\nSum of even numbers: "+even);
		System.out.println("Sum of odd numbers: "+odd);
	}
	public static void main(String... s){
		EvenOddSum eos=new EvenOddSum();
		eos.input();
		eos.sum();
	}
}
