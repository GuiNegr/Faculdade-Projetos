package TODASASADO;
import java.util.Scanner;
public class exe0104 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero para a soma");
        double num = ler.nextDouble();

        System.out.println("Informe outro numero");
        double num2 = ler.nextDouble();

        double soma = soma(num,num2);
        System.out.println(soma);
        ler.close();
    }public static double soma(double num,double num2){
        double soma = num + num2;
        return soma;
    }
}
