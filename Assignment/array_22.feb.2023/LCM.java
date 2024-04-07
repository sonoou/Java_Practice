class LCM{
	void lcm(int x[]){
		boolean mltply;
		int max=x[0],result=1;

		for(int i=0;i<x.length;i++){
			if(max<x[i]){
				max=x[i];
			}
		}

		for(int i=2;i<=max;i++){
			mltply=false;
			for(int j=0;j<x.length;j++){
				if(x[j]%i==0){
					x[j]=x[j]/i;
					mltply=true;
				}
			}
			if(mltply==true){
				result*=i;
				i--;
			}
		}
		System.out.println("LCM is "+result);
	}
	public static void main(String... s){
		int a[]=Array.input();
		LCM l=new LCM();
		l.lcm(a);
	}
}
