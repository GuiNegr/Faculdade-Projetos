package TODASASADO;
import java.util.Scanner;
public class exe0802 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("QUANTOS AÇAI PEQUENO?");
        int qntd = ler.nextInt();
        System.out.println("QUANTOS AÇAI MEDIO");
        int qntd2 = ler.nextInt();
        System.out.println("QUANTOS AÇAI GRANDE?");
        int qntd3 = ler.nextInt();

        double acaip = 13.50;
        double acaim = 15.00;
        double acaig = 17.50;

        double finals = (acaip * qntd) + (acaim * qntd2) + (acaig * qntd3);

        System.out.println("O VALOR PAGO SERÁ DE R$"+finals);
        ler.close();
    }
}
