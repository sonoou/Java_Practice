import java.io.*;

class Poutput implements Runnable{
	PipedWriter pout;
	Poutput(PipedWriter pout){
		this.pout = pout;
	}
	public void run(){
		for(int i=65;i<=91;i++){
			try{
				pout.write(i);
				Thread.sleep(1000);
			}
			catch(Exception e){
				//empty
			}
		}
	}
}

class Pinput implements Runnable{
	PipedReader pin;
	Pinput(PipedReader pin){
		this.pin = pin;
	}
	public void run(){
		int z = 0;
		for(int i=65;i<=91;i++){
			try{
				z = pin.read();
			}
			catch(Exception e){
				//empty
			}
			System.out.println((char)z);
		}
	}
}

class Prun{
	public static void main(String args[])throws IOException{
		PipedWriter pout = new PipedWriter();
		PipedReader pin = new PipedReader();
		pout.connect(pin);
		Poutput po = new Poutput(pout);
		Pinput pi = new Pinput(pin);
		Thread t1 = new Thread(po);
		Thread t2 = new Thread(pi);
		t1.start();
		t2.start();
	}
}
