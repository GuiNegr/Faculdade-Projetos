import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {


    public  Calculadora() throws  RemoteException{
        super();
    }

    @Override
    public int adicao(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int subtracao(int x, int y) throws RemoteException {
        return x - y;
    }

    @Override
    public int multiplicacao(int x, int y) throws RemoteException {
        return x * y;
    }

    @Override
    public int divisao(int x, int y) throws RemoteException {
        return x / y;
    }
}
