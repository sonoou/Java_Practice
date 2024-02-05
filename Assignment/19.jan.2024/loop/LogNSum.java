class LogNSum{
	float n;

	void input(){
		System.out.print("Enter the number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void sum(){
		float s=0;
		System.out.print(1);
		for(float i=1;i<=n;i++){
			if(i%2==0){
				s=s-1/i;
				System.out.print(" + 1/"+i);
			}
			else{
				s=s+1/i;
				System.out.print(" - 1/"+i);
			}
		}
		System.out.println("\nSum of natural logarithm of 2 is "+s);
	}
	public static void main(String... s){
		LogNSum l=new LogNSum();
		l.input();
		l.sum();
	}
}
