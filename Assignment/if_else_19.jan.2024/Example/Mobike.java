class Mobike1{
	public static void main(String... s){
		int charge=0;
		System.out.print("Enter the Bike number: ");
		String bno=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the customer Name: ");
		String name=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the no of days: ");
		int days=new java.util.Scanner(System.in).nextInt();

		if(days<=5){
			charge=500*days;
		}
		else if(days>5 && days<=10){
			charge=2500+400*(days-5);
		}
		else if(days>10){
			charge=2500+2000+200*(days-10);
		}

		System.out.println("Bike no"+"\t\t"+"Customer name"+"\t"+"Days"+"\t"+"Charge");
		System.out.println(bno+"\t\t\t"+name+"\t"+days+"\t"+charge+"\t");
	}
}
