package TODASASADO;
import java.util.Scanner;
public class exe0501 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho de um lado do quadrado");
        int num = ler.nextInt();

        int quadrado = num * num;
        System.out.println("o tamanho do seu quadrado é "+quadrado);
        ler.close();
    }
}
