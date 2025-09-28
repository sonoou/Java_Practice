package my;

import java.rmi.*;

public interface MyRemote extends Remote{
	public int add(int x, int y) throws RemoteException;
}
