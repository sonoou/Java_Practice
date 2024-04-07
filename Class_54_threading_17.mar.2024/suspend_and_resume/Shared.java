class Shared{
	int x;
	Temp t = new Temp();
	synchronized void show4(String s,int a){
		x=a;
		System.out.println("starting in method "+s+" "+x);
		Thread.currentThread().suspend();
		Thread.currentThread().resume();
		System.out.println("exit from method "+s+" "+x);
	}
}

