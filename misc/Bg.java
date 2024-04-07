class Bg{
	public static void main(String... s){
        System.out.print("Foreground(3) or Background(4): ");
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<=255;i++){
			System.out.print("\033["+n+"8;5;"+i+"m");
			if(i>=100 && i<=255){
				System.out.print(" ");
			}
			else if(i>=10 && i<=99){
				System.out.print("  ");
			}
			else{
				System.out.print("   ");
			}
			System.out.print(i+"\033[0m");
			//System.out.println("\033[48;5;"+i+"m   \033[0m");
//			for(int j=1;j<=n;j++){
//				System.out.print(" ");
//			}
		}
	}
}
