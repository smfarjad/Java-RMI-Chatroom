import java.rmi.*;
import java.util.*;
     
public interface ChatServerInterface extends Remote{	
    	public boolean login (ChatClientInterface a)throws RemoteException ;
    	public void publish (String s)throws RemoteException ;
    	public Vector getConnected() throws RemoteException ;
    }