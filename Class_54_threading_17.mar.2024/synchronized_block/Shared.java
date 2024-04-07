class Shared{
	int x;
	void show2(String s,int a){
		System.out.println("starting in method "+s);
		synchronized(this){
			x=a;
			System.out.println("starting in block "+s+" "+x);
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
			}
			System.out.println("exit from block "+s+" "+x);
		}
	}
}
