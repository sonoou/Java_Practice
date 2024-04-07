class SumNSeries{
	float n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void sum(){
		float s=0f;
		for(float i=1f;i<=n;i++){
			s+=1f/i;
		}
		System.out.println("Sum of n series: "+s);
	}
	public static void main(String... a){
		SumNSeries s=new SumNSeries();
		s.input();
		s.sum();
	}
}
