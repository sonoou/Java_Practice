
class CosX{
	float x;
	float n;

	void input(){
		System.out.print("Enter value for x: ");
		x=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter value for n: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void compute(){
		float result=1;
		float f=1;
		boolean p=false;

		for(int i=2;i<=n;i+=2){
			System.out.println("\ni = "+i);
			for(int j=1;j<=i;j++){
				f=f*j;
			}
			System.out.println("f = "+f);
			if(p==false){
				result-=x*i/f;
				System.out.println(p+" result = "+result);
				p=true;
			}
			else{
				result+=x*i/f;
				System.out.println(p+" result = "+result);
				p=false;
			}
			f=1;
		}
		System.out.println("Cos x: "+result);
	}
	public static void main(String... s){
		CosX  cs=new CosX();
		cs.input();
		cs.compute();
	}
}

