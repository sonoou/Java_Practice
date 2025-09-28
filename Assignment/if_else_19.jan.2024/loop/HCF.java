class HCF{
	int a;
	int b;
	int result=1;

	void input(){
		System.out.print("Enter first number: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter second number: ");
		b=new java.util.Scanner(System.in).nextInt();
	}
	void find(){
		int x,i=2;
		if(a>b){
			x=b;
		}
		else{
			x=a;
		}

		while(i<=x){
			if((a%i==0) && (b%i==0)){
				a/=i;
				b/=i;
				result*=i;
			}
			else{
				i++;
			}
		}
		System.out.println("\nHCF is "+result);
	}
	public static void main(String... s){
		HCF h=new HCF();
		h.input();
		h.find();
	}
}
