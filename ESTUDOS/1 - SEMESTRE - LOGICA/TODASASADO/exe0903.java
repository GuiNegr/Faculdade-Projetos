package TODASASADO;
import java.util.Scanner;
public class exe0903 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é a capacidade do tanque?");
        double tanque = ler.nextInt();

        System.out.println("Quantidade atual do carro está em?");
        double litros = ler.nextInt();

        boolean status = false;

        double frac = tanque / 4;

        if(litros < frac){
            status = true;
        }

        System.out.println("O CARO PRECISA SER REABASTECIDO? "+status);
        ler.close();
    }
}
