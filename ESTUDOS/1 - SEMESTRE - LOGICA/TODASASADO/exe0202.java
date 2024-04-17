package TODASASADO;
import java.util.Scanner;
public class exe0202 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o valor da compra");
        double valor = ler.nextDouble();

        System.out.println("Informe o valor do desconto em %");
        double desconto = ler.nextDouble();

        double finals = valor  * (desconto / 100);

        double valorfinal = valor - finals;

        System.out.println("COMPRA FINALIZADA ! O VALOR FICOU EM "+valorfinal);
        ler.close();
    }
}
