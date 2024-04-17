package TODASASADO;
import java.util.Scanner;
public class exe0402 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("iNFORME UM VALOR");
        double reais = ler.nextDouble();

        double dolar = reais * 5.16;
        
        System.out.println(dolar);
        ler.close();
    }
}
