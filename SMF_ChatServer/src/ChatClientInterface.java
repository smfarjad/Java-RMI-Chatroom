import java.rmi.*;
     
public interface ChatClientInterface extends Remote{	
    	public void tell (String name)throws RemoteException ;
    	public String getName()throws RemoteException ;
    }