package TODASASADO;
import java.util.Scanner;
public class exe0702 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("quantos açai ira comprar?");
        int qntd = ler.nextInt();

        double açai = 13.50 * qntd;

        System.out.println(açai);
        ler.close();
    }
}
