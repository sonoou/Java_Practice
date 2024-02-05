class Mobike{
	String bno;
	String name;
	int days;
	int charge;

	void input(){
		System.out.print("Enter the bike number: ");
		bno=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the customer name: ");
		name=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the no of days: ");
		days=new java.util.Scanner(System.in).nextInt();
	}
	void compute(){
		if(days<=5){
			charge=days*500;
		}
		else if(days>5 && days<=10){
			charge=2500+400*(days-5);
		}
		else if(days>10){
			charge=2500+2000+200*(days-10);
		}
		else{
			System.out.println("No charge");
		}
	}
	void display(){
		System.out.println("\nBike No.\tName\tNo. of days\tCharge");
		System.out.println(bno+"\t"+name+"\t"+days+"\t\t"+charge);
	}
	public static void main(String... s){
		Mobike b=new Mobike();
		b.input();
		b.compute();
		b.display();
	}
}