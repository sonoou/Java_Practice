class Discount{
	int quantity;
	int total;

	void input(){
		System.out.print("Enter the quantity: ");
		quantity=new java.util.Scanner(System.in).nextInt();
	}
	void discount(){
		if((quantity*100)>1000){
			total=quantity*100-quantity*100*10/100;
			System.out.println("Total price: "+total);
		}
		else{
			total=quantity*100;
			System.out.println("Total price: "+total);
		}
	}
	public static void main(String... s){
		Discount d=new Discount();
		d.input();
		d.discount();
	}
}
