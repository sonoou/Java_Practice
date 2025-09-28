class LocalBlock{
	//static int x=200;
	public static void main(String... s){
		int y=40;
		//local block
		{
			int x=20;
			System.out.println(x);
		}

		System.out.println(y);
		//System.out.println(x);
	}
}
