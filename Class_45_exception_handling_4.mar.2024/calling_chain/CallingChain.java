class CallingChain{
	void show(){
		int x=10/0;
	}
	void display(){
		show();
	}
	void xyz(){
		display();
	}
	public static void main(String... s){
		try{
			new CallingChain().xyz();
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
