class Bg{
	public static void main(String... s){
		System.out.print("Enter number of space: ");
		int n=new java.util.Scanner(System.in).nextInt();

		for(int i=0;i<=255;i++){
			System.out.print("\033[48;5;"+i+"m  \033[0m");
//			for(int j=1;j<=n;j++){
//				System.out.print(" ");
//			}
		}
	}
}
