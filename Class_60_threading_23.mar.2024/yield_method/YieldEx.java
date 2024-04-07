/*
** yield() make the currently running thread head back to runnable to
** allow other threads to get their turn.
** A thread can be moved out of the virtual CPU by yielding
** A thread that has yield goes into the Ready state.
** The yield() method is a static method of the Thread class.
** It always causes the currently executing thread to yield
*/

class MyThread extends Thread{
	public MyThread(){

	}

	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Counting: "+i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				//empty
			}
		}
	}
}

public class YieldEx{
	public static void main(String args[]){
		MyThread ct = new MyThread();
		ct.start();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			//empty
		}
		Thread.yield();
		System.out.println("main ");
	}
}
