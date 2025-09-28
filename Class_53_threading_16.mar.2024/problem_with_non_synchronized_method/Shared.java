class Shared{
	int x,y;
   	synchronized int add(int a, int b){
		System.out.println("inside add method "+Thread.currentThread().getName());
		x = a;
		y = b;
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			//empty
		}
		return x+y;
	}
}
