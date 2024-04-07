class Shared{
	int flag = 0;
	int data = 0;
	synchronized public void submit(){
		flag = 1;
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
		}
		data = 10;
		System.out.println("value submitted");
		notify();
	}
	synchronized int withdraw(){
		if(flag==0){
			try{
				System.out.println("sending into wait block");
				wait();
			}
			catch(Exception e){
			}
		}
		return data;
	}
}
