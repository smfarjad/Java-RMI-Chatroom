import java.rmi.*;
import java.rmi.server.*;
     
public class StartServer {
public static void main(String[] args) {
    		try {
    				//System.setSecurityManager(new RMISecurityManager());
    			 	java.rmi.registry.LocateRegistry.createRegistry(1099);
    			 	
    				ChatServerInterface b=new ChatServer();	
    				Naming.rebind("rmi://192.168.122.131/myabc", b);
    				System.out.println("[System] Chat Server is ready.");
    			}catch (Exception e) {
    					System.out.println("Chat Server failed: " + e);
    			}
    	}
    }

//java.rmi.registry.LocateRegistry.createRegistry(1099



//ip address badal k apni wali lagani hai