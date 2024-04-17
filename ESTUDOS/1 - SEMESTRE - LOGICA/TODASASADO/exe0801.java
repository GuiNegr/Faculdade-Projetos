package TODASASADO;
import java.util.Scanner;
public class exe0801 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado");
        int lado = ler.nextInt();

        int octa = lado * 8;

        System.out.println("O PERIMETRO DO SEU OCTAGONO É "+octa);
        ler.close();
    }
}
