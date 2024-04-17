package TODASASADO;
import java.util.Scanner;
public class exe0405 {
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    System.out.println("informe uma cor");
    String cor = ler.nextLine();
    boolean z = corcheck(cor);

    System.out.println("informe uma cor");
    String cor2 = ler.nextLine();
    boolean x = corcheck(cor2);

    boolean a = resp(z,x);
        System.out.println("as cores são prmarias? "+a);

        ler.close();
    }public static boolean corcheck(String cor){
        boolean status = false;

        if(cor.equalsIgnoreCase("azul") || 
        cor.equalsIgnoreCase("vermelho") 
        || cor.equalsIgnoreCase("amarelo")){
            status = true;
        }
        return status;
    }public static boolean resp(boolean z , boolean x){
        boolean status = false;

        if(z == true && x == true){
            status = true;
        }
        return status;
    }
}
