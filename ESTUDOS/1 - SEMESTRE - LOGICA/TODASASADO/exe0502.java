package TODASASADO;
import java.util.Scanner;
public class exe0502 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da compra");
        double valor =  ler.nextDouble();

        System.out.println("Informe quantas vezes no cartao");
        int card =  ler.nextInt();

        double finals = valor / card;

        System.out.println("SUA COMPRA DE R$"+valor+" PARCELADA EM "+card+"x de R$"+finals+ " FOI APROVADA");
        ler.close();
    }
}
