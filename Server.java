import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements Interface {
    private int x;

    public Server() throws RemoteException {
        x = 0; // Inicializa a variável no servidor
    }

    public int inc() throws RemoteException {
        return x++;
    }

    public int get() throws RemoteException {
        return x;
    }

    public void reset() throws RemoteException {
        x = 0;
    }

    public void soma(int a, int b) throws RemoteException {
        x = a + b;
    }

    public int getSoma() throws RemoteException {
        return x;
    }

    public void printMessage(String message) throws RemoteException {
        System.out.println("Mensagem recebida no servidor: " + message);
    }

    final static String URL = "rmi://127.0.0.1/Incrementa";

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Server obj = new Server();
            Naming.rebind(URL, obj);
            System.out.println("Servidor pronto e aguardando conexões...");
        } catch (Exception e) {
            System.out.println("Erro no server: " + e);
        }
    }
}
