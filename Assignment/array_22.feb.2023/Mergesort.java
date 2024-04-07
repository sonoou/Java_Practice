class Mergesort{
	void mergesort(int x[], int y[]){
		int in=0;
		int a[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++){
			a[in]=x[i];
			in++;
		}
		for(int i=0;i<y.length;i++){
			a[in]=y[i];
			in++;
		}
		new Sort().sort(a);
	}
	public static void main(String... s){
		System.out.println("First array");
		int a[]=Array.input();

		System.out.println("Second array");
		int b[]=Array.input();

		Mergesort ms=new Mergesort();
		ms.mergesort(a,b);
	}
}
