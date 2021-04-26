package Cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import Servidor.servidorIF;
public class ClienteChat extends UnicastRemoteObject implements clienteIF, Runnable {
	private static final long serialVersionUID = 1L;

	private servidorIF chatServidor;
	private String nombre= null;
	protected ClienteChat(String name, servidorIF chatServidor) throws RemoteException {
		this.nombre=name;
		this.chatServidor=chatServidor;
		chatServidor.registrarChatCliente(this);
	}

	public void RecuperarMensaje(String mensaje) throws RemoteException {
		System.out.println(mensaje);
		
	}

	public void run() {
		Scanner texto = new Scanner(System.in);
		String mensaje;
		while (true) {
			mensaje = texto.nextLine();
			try {
				chatServidor.broadcastMessage(nombre+ ":::::  "+mensaje);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		
	}

}
