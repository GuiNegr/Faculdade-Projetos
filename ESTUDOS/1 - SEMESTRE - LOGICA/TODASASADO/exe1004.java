package TODASASADO;
import java.util.Scanner;
public class exe1004 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        String x = repo(nome);
        System.out.println("OLÁ SEJA BEM VINDO(A) "+x);
        ler.close();
    }public static String repo(String nome){
        String repo = nome.substring(0,6);
        return repo;
    }
}
