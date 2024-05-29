import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            ICalculadora calc = new Calculadora();
            String objName = "rmi://localhost/calc";

            System.out.println("registrando o objeto no rmiRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName,calc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
