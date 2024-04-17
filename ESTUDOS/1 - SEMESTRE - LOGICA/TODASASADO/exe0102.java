package TODASASADO;
import java.util.Scanner;
public class exe0102 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da compra");
        double valor = ler.nextDouble();

        System.out.println("Informe o valor de desconto");
        double desconto = ler.nextDouble();

        double finals = valor - desconto;
        System.out.println("Compra finalizada ! O valor ficou em R$"+finals);
        ler.close();
    }
}
