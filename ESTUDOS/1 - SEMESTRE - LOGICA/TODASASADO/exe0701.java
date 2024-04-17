package TODASASADO;
import java.util.Scanner;
public class exe0701 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a base");
        int base = ler.nextInt();
        System.out.println("Informe a altura");
        int altura = ler.nextInt();

        double triangulo = (base * altura) / 2;

        System.out.println("A AREA DO SEU TRIANGULO É "+triangulo);
        ler.close();
    }
}
