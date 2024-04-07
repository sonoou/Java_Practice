import java.awt.*;
import javax.swing.*;

public class ShutdownHooks implements Runnable{
	public void run(){
		System.out.println("*** Application Shutting down ***");
		ShutdownHooks1 hook = new ShutdownHooks1();
		Thread t1 = new Thread(hook);
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e){
			//empty
		}
		System.out.println("*** After Backup ***");
	}
}

class ShutdownHooks1 implements Runnable{
	public void run(){
		System.out.println("*** Taking backup and closing resources ***");
		try{
			Thread.sleep(1000*5);
		}
		catch(Exception e){
			//empty
		}
	}
}

class RunHookup{
	public static void main(String args[]){
		Runtime runTime = Runtime.getRuntime();
		ShutdownHooks hook = new ShutdownHooks();

		//Registering the Shutdown Hook
		runTime.addShutdownHook(new Thread(hook));
		//System.exit(0);
		//int x = 10/0;
		JFrame testFrame = new JFrame("Test Frame");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setSize(400,400);
		testFrame.setVisible(true);
		System.out.println("hello");
	}
}
