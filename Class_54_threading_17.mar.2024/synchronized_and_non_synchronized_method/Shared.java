class Shared{
	int x;

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

	void show1(String s, int a){
		x = a;
		System.out.println("starting show1 "+s+" "+x);
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			//empty
		}
		System.out.println("ending show1 "+s+" "+x);
	}
}
