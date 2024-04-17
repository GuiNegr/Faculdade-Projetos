package TODASASADO;
import java.util.Scanner;
public class exe0401 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe um numero");
        int num = ler.nextInt();

        int metade = num / 2;
        System.out.println("A METADE DO SEU NUMERO É "+metade);
        ler.close();
    }
}
