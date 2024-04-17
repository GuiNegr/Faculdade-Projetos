package TODASASADO;
import java.util.Scanner;
public class exe1008 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        String palindromo = "arara";

        System.out.println(sc(palindromo));
        
        ler.close();


    }public static boolean sc(String palindromo){
        String vazio = "";
        boolean status = false;
        for(int i = (palindromo.length() - 1); i >= 0; i--){
            vazio += palindromo.charAt(i);
        }
        
        if(palindromo.equals(vazio)){
            status = true;
        }
        return status;
    }
}
