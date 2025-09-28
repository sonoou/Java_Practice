class Shared{
	int x;
	Temp t = new Temp();
	void show2(String s,int a){
		System.out.println("starting in method "+s);
		synchronized(t){
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

class Temp{
	void dilTohPagalHai(String s){
		System.out.println("starting haa mai hoooooooooo in dilTohPagalHai"+"  "+s);
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
		}
		System.out.println("ending from dilTohPagalHai"+" "+s);
	}
}
