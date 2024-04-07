class SinX{
	float x;
	float n;

	void input(){
		System.out.print("Enter value for x: ");
		x=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter value for n: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void compute(){
		float result=0;
		boolean p=true;
		float f=1;

		for(int i=1;i<=n;i+=2){
			for(int j=1;j<=i;j++){
				f=f*j;
			}
			if(p==true){
				result+=x*i/f;
				p=false;
			}
			else{
				result-=x*i/f;
				p=true;
			}
			f=1;
		}
		System.out.println("Sin x : "+result);
	}
	public static void main(String... s){
		SinX sn=new SinX();
		sn.input();
		sn.compute();
	}
}
