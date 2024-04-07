class MultiplicationTable{
	int a;
	int result;

	void input(){
		System.out.print("Enter a positive number: ");
		a=new java.util.Scanner(System.in).nextInt();
	}
	void table(){
		for(int i=1;i<=10;i++){
			result=a*i;
			System.out.println(a+" x "+i+" = "+result);
		}
	}
	public static void main(String... s){
		MultiplicationTable mt=new MultiplicationTable();
		mt.input();
		mt.table();
	}
}
