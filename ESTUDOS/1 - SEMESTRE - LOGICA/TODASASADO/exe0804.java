package TODASASADO;
import java.util.Scanner;
public class exe0804 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira uma cor");
        String cor = ler.nextLine();
        boolean status = resp(cor);

        System.out.println("É COR PRIMARIA?" +status);
        ler.close();
    }public static boolean resp (String cor){
        boolean status = false;

        if(cor.equalsIgnoreCase("azul") ||
         cor.equalsIgnoreCase("vermelho") || 
         cor.equalsIgnoreCase("amarelo")){
            status = true;
        }
        return status;
    }
}
