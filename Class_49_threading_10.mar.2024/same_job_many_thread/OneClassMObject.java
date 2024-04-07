class Thread1 extends Thread{
	Thread1(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("har har mahadev ghar ghar modi");
			//System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				//empty
			}
		}
		System.out.println(getName()+" dead");
	}
}

class OneClassMObject{
	public static void main(String s[]){
		Thread1 t1 = new Thread1("thread1");
		Thread1 t2= new Thread1("thread2");
		Thread1 t3= new Thread1("thread3");

		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("tata");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				//empty
			}
		}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}
