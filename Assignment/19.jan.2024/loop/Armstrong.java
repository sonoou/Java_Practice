class Armstrong{
	public static void main(String... s){
		int a;
		int r;
		int arm=0;
		for(int i=1;i<=500;i++){
			//System.out.println("\n"+i+" iteration");
			a=i;
			//System.out.println("a = "+a);
			while(a>0){
				r=a%10;
				//System.out.println("r = "+r);
				arm+=(r*r*r);
				//System.out.println("arm = "+arm);
				a/=10;
				//System.out.println("a = "+a);
			}
			if(arm==i){
				System.out.println(arm+" ");
			}
			arm=0;
		}
		System.out.println("\n\u001b[31mPrograme finished!\u001b[0m\n");
	}
}
