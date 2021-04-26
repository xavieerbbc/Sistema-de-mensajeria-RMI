package Servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Cliente.clienteIF;

public interface servidorIF extends Remote {
	void registrarChatCliente(clienteIF chatCliente)throws RemoteException;
	void broadcastMessage(String mensaje)throws RemoteException;
}
