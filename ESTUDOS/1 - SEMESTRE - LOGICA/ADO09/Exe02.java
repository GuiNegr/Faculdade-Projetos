package ADO09;
import java.util.Scanner;
public class Exe02 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);

        double[] numeros = new double[5];
        chamada(ler,numeros);
        exibir(numeros);
    }public static void chamada(Scanner ler, double[] numeros){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = ler.nextDouble();
        }
    }public static void exibir(double[]numeros){
        System.out.println("OS NUMEROS INFORMADOS FORAM: ");
        for(double item : numeros){
            System.out.println(item);
        }
    }
}
