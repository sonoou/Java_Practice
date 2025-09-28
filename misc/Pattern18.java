class Pattern18{
	public static void main(String args[]){
		System.out.println("Enter the value: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int p=1;
		for(int i=1;i<=num;i=i+2){
			for(int k=i;k<=num;k=k+2){
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++){
				if(p<=9){
					System.out.print("  ");
				}
				else{
					System.out.print(" ");
				}
				System.out.print(p++);
			}
			System.out.println();
		}
	}
}
