class CustomThread extends Thread{
	Shared s;
	public CustomThread(Shared s,String str){
		super(str);
		this.s=s;
		start();
	}
	public void run(){
		s.show(Thread.currentThread().getName(),10);
	}
}

class CustomThread1 extends Thread{
	Shared s;
	public CustomThread1(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		s.show1(Thread.currentThread().getName(),20);
	}
}

class CustomThread2 extends Thread{
	Shared s;
	public CustomThread2(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		//System.out.println("Thread2 Sum of 1000,2000 = "+s.add(1000,2000));
	}
}
