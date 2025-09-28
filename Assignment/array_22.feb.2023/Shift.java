class Shift{
	void shift(int x[]){
		System.out.println("Before Shift");
		Array.print(x);
		int n=0;
		for(int i=0;i<x.length;i++){
			if(x[i]<0){
				n++;
			}
		}
		for(int i=0;i<x.length-1;i++){
			for(int j=0;j<x.length-1-i;j++){
				if(x[j]>x[j+1]){
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(x[j]<x[j+1]){
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println("After Shift");
		Array.print(x);
	}
	public static void main(String... s){
		int a[]=Array.input();
		Shift sh=new Shift();
		sh.shift(a);
	}
}
