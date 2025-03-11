import java.rmi.*;

public interface Interface extends Remote {
    public int inc() throws RemoteException;
    public int get() throws RemoteException;
    public void reset() throws RemoteException; // Método para zerar o valor
    public void soma(int a, int b) throws RemoteException; // Método para somar dois valores
    public int getSoma() throws RemoteException; // Método para obter o valor da soma
    public void printMessage(String message) throws RemoteException; // Método para imprimir uma mensagem
}
