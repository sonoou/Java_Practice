class Shared{
	int x;

	static synchronized void show(String s, int a){
		System.out.println("starting in show "+s);
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			//empty
		}
		System.out.println("exit from show "+s);
	}

	synchronized void show1(String s, int a){
		x = a;
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
