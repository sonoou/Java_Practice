class GenerateRandom{
	int n;
	int a;

	void input(){
		n=(int)(Math.random()*9+1);
	}
	void gen(){
		while(true){
			a=new java.util.Scanner(System.in).nextInt();
			if(a<n){
				System.out.println("Too low, try again.");
			}
			else if(a>n){
				System.out.println("Too high, try again.");
			}
			else{
				System.out.println("Number is "+a);
				break;
			}
		}
	}
	public static void main(String... s){
		GenerateRandom gn=new GenerateRandom();
		gn.input();
		gn.gen();
	}
}
