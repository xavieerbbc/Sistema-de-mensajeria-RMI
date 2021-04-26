package Servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorDriver {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		System.out.println("Iniciando servidor..."); 
	      try { 
	          LocateRegistry.createRegistry(1091); 
	          Naming.rebind("RMIChatServer", 
	        		  new ServidorChat()); 
	      } catch (Exception e) { 
	          e.printStackTrace(); 
	          System.exit(1); 
	      } 
	      System.out.println("Servidor INICIADO");
	}

}
