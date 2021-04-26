package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Cliente.clienteIF;



public class ServidorChat extends UnicastRemoteObject implements servidorIF{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<clienteIF>chatClientes; 
	protected ServidorChat() throws RemoteException {
		chatClientes = new ArrayList<clienteIF>();
	}

	public synchronized void registrarChatCliente(clienteIF chatCliente) throws RemoteException {
		this.chatClientes.add(chatCliente);
		
	}

	public synchronized  void broadcastMessage(String mensaje) throws RemoteException {
		// TODO Auto-generated method stub
		int i=0;
		while (i<this.chatClientes.size()) {
			chatClientes.get(i++).RecuperarMensaje(mensaje);
			
		}
		
	}

}
