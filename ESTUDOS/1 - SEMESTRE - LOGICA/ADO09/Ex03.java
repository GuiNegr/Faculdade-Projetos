package ADO09;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String[] lista = new String[5];
        nomes(ler,lista);
        exibiri(lista);
    }public static void nomes(Scanner ler, String[]lista){
        for(int i = 0; i < lista.length; i++){
            lista[i] = ler.nextLine();
        }
    }public static void exibiri(String[]lista){
        System.out.println("OS NOMES INFORMADOS FORAM: ");
        for(String item : lista){
            System.out.println(item);
        }
    }
}
