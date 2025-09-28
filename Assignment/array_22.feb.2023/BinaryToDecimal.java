class BinaryToDecimal{
	void binarytodecimal(int x[]){
		int y[]=new int[x.length];
		y[0]=1;

		for(int i=1;i<y.length;i++){
			y[i]=y[i-1]*2;
		}

		int decimal=0;
		for(int i=0;i<x.length;i++){
			if(x[i]==1){
				decimal+=y[x.length-1-i];
			}
		}
		System.out.print("Binary value is ");
		Array.print(x);
		System.out.print("Decimal value is "+decimal);
	}
	public static void main(String... s){
		int a[];
		System.out.println("Enter total digits in binary no: ");
		int n=new java.util.Scanner(System.in).nextInt();
		a=new int[n];
		System.out.println("Enter binary number:");
		for(int i=0;i<a.length;i++){
			n=new java.util.Scanner(System.in).nextInt();
			if(n==1 || n==0){
				a[i]=n;
			}
			else{
				System.out.println("Binary number only contains 0 and 1");
				i--;
			}
		}

		BinaryToDecimal b=new BinaryToDecimal();
		b.binarytodecimal(a);
	}
}
