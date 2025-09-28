class Pattern1_mod{
	String s;

	void input(){
		System.out.print("Enter a string: ");
		s=new java.util.Scanner(System.in).next();
	}
	void print(){
		int n=s.length();
		for(int i=1;i<=n-2;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(j==1){
					System.out.print(s.charAt(i/2)+" ");
				}
				else if(j==i/2+1 || j==n-i/2){
					//if(j==1){
					//	System.out.print(s.charAt(i/2)+" ");
					//}
					//else{
						System.out.print("* ");
					//}
				}
				else{
					//if(j==1){
					//	System.out.print(s.charAt(i/2)+" ");
					//}
					//else{
						System.out.print("  ");
					//}
				}
			}
		}
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(j==1){
					System.out.print(s.charAt(n/2+i/2)+" ");
				}
				else if(j==n/2-i/2+1 || j==n/2+i/2+1){
					//if(j==1){
					//	System.out.print(s.charAt(i/2)+" ");
					//}
					//else{
						System.out.print("* ");
					//}
				}
				else{
					//if(j==1){
					//	System.out.print(s.charAt(i/2)+" ");
					//}
					//else{
						System.out.print("  ");
					//}
				}
			}
		}
	}
	public static void main(String... s){
		Pattern1_mod pm=new Pattern1_mod();
		pm.input();
		pm.print();
	}
}
