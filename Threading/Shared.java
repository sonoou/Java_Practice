class Shared{
	int x,y;
	synchronized void show(String s, int a){
		x = a;
		System.out.println("starting in method "+s+" "+x);
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			//empty
		}
		System.out.println("exit from method "+s+" "+x);
	}
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
	synchronized void show1(String s,int a){
		System.out.println("starting show1 "+s);
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			//empty
		}
		System.out.println("ending show1 "+s);
	}
}

