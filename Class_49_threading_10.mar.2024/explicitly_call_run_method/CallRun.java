class Thread1 extends Thread{
	Thread1(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			//System.out.println(getName());
			System.out.println(Thread.currentThread().getName());
			//System.out.println("hello");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println("Thread1 class run completed");
	}
}

class Thread2 extends Thread{
	Thread2(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("hay");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println("Thread2 class run complete");
	}
}

class Thread3 extends Thread{
	Thread3(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=15;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("bye");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println("Thread3 class run completed");
	}
}

class CallRun{
	public static void main(String s[]){
		Thread1 t1 = new Thread1("thread1");
		Thread2 t2 = new Thread2("thread2");
		Thread3 t3 = new Thread3("thread3");

		t1.run();
		t2.run();
		t3.run();

		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName());
			//System.out.println("tata");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}
