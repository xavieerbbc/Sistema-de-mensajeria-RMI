package Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Servidor.servidorIF;

public class ClienteDriver {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		String ChatServerURl = "rmi://localhost/RMIChat";
		servidorIF chatServer = (servidorIF)Naming.lookup(ChatServerURl);
		new Thread(new ClienteChat(args[0], chatServer)).start();
	}

}
 