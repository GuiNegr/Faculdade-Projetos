package TODASASADO;
import java.util.Scanner;
public class exe0403 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        boolean status = false;
        if(num % 2 == 0 ){
            status = true;
        }
        System.out.println("O NUMERO É PAR? "+status);
        ler.close();
    }
}
