class HCF{
	void hcf(int x[]){
		int max=x[0],result=1;
		boolean  mltply;

		for(int i=0;i<x.length;i++){
			if(max<x[i]){
				max=x[i];
			}
		}
		for(int i=2;i<=max;i++){
			mltply=false;
			for(int j=0;j<x.length;j++){
				if(x[j]%i==0){
					mltply=true;
				}
				else{
					mltply=false;
					break;
				}
			}
			if(mltply==true){
//				for(int j=0;j<x.length;j++){
//					x[j]=x[j]/i;
//				}
				result=i;
			}
		}
		System.out.println("HCF is "+result);
	}
	public static void main(String... s){
		int a[]=Array.input();
		HCF h=new HCF();
		h.hcf(a);
	}
}
