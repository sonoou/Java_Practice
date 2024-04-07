class KthSmallestElement{
	void kthsmallestelement(int x[]){
		System.out.print("\nEnter number of nth smallest element: ");
		int n=new java.util.Scanner(System.in).nextInt();

		for(int i=0;i<x.length-1;i++){
			for(int j=0;j<x.length-1-i;j++){
				if(x[j]>x[j+1]){
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}

		System.out.println(n+"th smallest element is "+x[n-1]);
	}
	public static void main(String... s){
		int a[]=Array.input();
		System.out.print("Input array");
		Array.print(a);
		KthSmallestElement k=new KthSmallestElement();
		k.kthsmallestelement(a);
	}
}
