class Intersection{
	void intersection(int x[], int y[]){
		System.out.println("Intersection: ");
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j]){
					System.out.print(" "+x[i]);
					y[j]=0;
				}
			}
		}
	}
	public static void main(String... s){
		System.out.println("First array");
		int a[]=Array.input();
		System.out.println("Second array");
		int b[]=Array.input();
		Intersection i=new Intersection();
		i.intersection(a,b);
	}
}
