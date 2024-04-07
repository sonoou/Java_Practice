enum Apple{
	A(10),B(9),C(12),D(15),E(8);
	private int price; //price of each apple
	Apple(int p){
		price = p;
	}
	int getPrice(){
		return price;
	}
}

class EnumConstructor{
	public static void main(String s[]){
		System.out.println("D costs "+Apple.D.getPrice()+" cents.");
		System.out.println("\nAll apple prices:");
		for(Apple a: Apple.values()){
			System.out.println(a+" costs "+a.getPrice()+" cents.");
		}
	}
}
