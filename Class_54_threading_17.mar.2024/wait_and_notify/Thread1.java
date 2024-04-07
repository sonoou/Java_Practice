class Thread1 extends Thread{
	Shared s;
	Thread1(Shared s,String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		System.out.println(s.withdraw());
	}
}

class Thread2 extends Thread{
	Shared s;
	Thread2(Shared s,String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		s.submit();
	}
}
