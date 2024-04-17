package TODASASADO;
import java.util.Scanner;
public class exe0603 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("EM QUAL COR ESTÁ O SEMAFORO? ");
        String resp = ler.next();

        Boolean status = false;

        if(resp.equalsIgnoreCase("verde")){
            status = true;
        }

        System.out.println("PODE ATRAVESSAR? "+status);
        ler.close();
    }
}
