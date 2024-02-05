class LargeSmallLoop{
	int n;

	void input(){
		System.out.print("Enter how many numbers you have: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void check(){
		int l=0;
		int s=0;
		int x;
		int temp;

		for(int i=1;i<=n;i++){
			System.out.print("Enter the "+i+" value: ");
			x=new java.util.Scanner(System.in).nextInt();

			if(l<x){
				temp=l;
				l=x;
				x=temp;
			}
			if(i==2){
				s=x;
			}
			if(s>x){
				//temp=s;
				s=x;
				//x=temp;
			}
		}
		System.out.println("\nLargest number is "+l);
		System.out.println("Smallest number is "+s);
	}
	public static void main(String... s){
		LargeSmallLoop l=new LargeSmallLoop();
		l.input();
		l.check();
	}
}
