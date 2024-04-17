package TODASASADO;
import java.util.Scanner;


public class exe0704 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o cateto oposto");
        double oposto = ler.nextDouble();

        System.out.println("Informe o adjacente");
        double adjacente = ler.nextDouble();

        double raiz = raiz(oposto, adjacente);

        System.out.println(raiz);
        ler.close();
    }public static double raiz(double oposto, double adjacente){
        double quadrado = oposto * oposto;
        double quadrado2 = adjacente * adjacente;
        double quae = quadrado2 + quadrado;
        double raiz = Math.sqrt(quae);
        return raiz;
    }
}
