package TODASASADO;
import java.util.Scanner;
public class exe0601 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a base do retangulo");
        int base = ler.nextInt();
        System.out.println("Informe a altura do triangulo");
        int altura = ler.nextInt();

        int retangulo = base * altura;

        System.out.println("A AREA DO SEU RETANGULO É " +retangulo);
        ler.close();
    }
}
