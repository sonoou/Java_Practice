class Thread1 extends Thread{
	Thread1(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("chay");
			try{					// 1000 milisecond = 1 second
				Thread.sleep(1000);// (long milisecond)throws InterruptedException(checked excpetion)
			}
			catch(Exception e){
				//empty
			}
		}
		System.out.println(getName()+" dead");
	}
}

class Thread2 extends Thread{
	Thread2(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("hay");
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

class Thread3 extends Thread{
	Thread3(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("bye");
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

class RunThread3{
	public static void main(String s[]){
		Thread1 t1 = new Thread1("thread1");
		Thread2 t2 = new Thread2("thread2");
		Thread3 t3 = new Thread3("thread3");

		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<=20;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("tata");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				//empty
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
