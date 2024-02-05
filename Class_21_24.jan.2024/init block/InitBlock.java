class InitBlock{
	int x;
	{
		this.x=10;
		System.out.println("init block");
	}
	InitBlock(){
		System.out.println("default");
		System.out.println(x);
	}
	InitBlock(int y){
		System.out.println(x+y);
	}
	public static void main(String... s){
		// new InitBlock();
		new InitBlock(10);
	}
}
