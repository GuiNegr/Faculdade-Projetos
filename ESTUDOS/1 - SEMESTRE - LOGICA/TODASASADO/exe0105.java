package TODASASADO;
import java.util.Scanner;
public class exe0105 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        double num = ler.nextDouble();
        double x = dobro(num);
        System.out.println(x);

        
        System.out.println("Informe um numero");
        double num1 = ler.nextDouble();
        double z = dobro(num1);
        System.out.println(z);
        ler.close();
    }public static double dobro(double num){
        double dobro = num * 2;
        return dobro;
    }
}
