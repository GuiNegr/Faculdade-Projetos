package TODASASADO;
import java.util.Scanner;
public class exe0504 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é sua temp:");
        double temp = ler.nextDouble();

        boolean status = febre(temp);

        System.out.println("VOCE ESTÁ COM FEBRE? "+status);
        ler.close();
    }public static boolean febre(double temp){
        boolean status = false;

        if (temp >= 37.5){
            status = true;
        }
        return status;
    }
}
