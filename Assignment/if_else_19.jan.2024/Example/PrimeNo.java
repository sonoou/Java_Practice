class PrimeNo{
	public static void main(String... s){
		System.out.print("Enter the value: ");
		int x1=new java.util.Scanner(System.in).nextInt();
		//String name=new java.util.Scanner(System.in).nextLine();
		int count=0;
		for(int i=1;i<=x1;i++){
			int z=x1%i;
			if(z==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("It is a prime no");
		}
		else{
			System.out.println("It is not a prime no");
		}
	}
}
