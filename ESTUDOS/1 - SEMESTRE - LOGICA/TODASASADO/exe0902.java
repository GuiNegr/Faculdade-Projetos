package TODASASADO;
import java.util.Scanner;
public class exe0902 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("QUANTOS AÇAI PEQUENO?");
        int qntd = ler.nextInt();
        System.out.println("QUANTOS AÇAI MEDIO");
        int qntd2 = ler.nextInt();
        System.out.println("QUANTOS AÇAI GRANDE?");
        int qntd3 = ler.nextInt();
        System.out.println("qual e o valor do cupom?");
        int desconto = ler.nextInt();

        double acaip = 13.50;
        double acaim = 15.00;
        double acaig = 17.50;

        double finals = (acaip * qntd) + (acaim * qntd2) + (acaig * qntd3);

        double valor = finals - (finals * (desconto / 100.0));
        System.out.println("O VALOR FINAL É DE "+valor);
        
        ler.close();
    }
}
