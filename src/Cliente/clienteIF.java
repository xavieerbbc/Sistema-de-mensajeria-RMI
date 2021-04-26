package Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface clienteIF extends Remote {

	void RecuperarMensaje(String mensaje) throws RemoteException;
}
