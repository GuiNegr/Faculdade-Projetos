package ADO09;
import java.util.Scanner;
public class Exe09 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME UMA FRASE:");
        String frase = ler.nextLine();
        String[] palavras = mapeamento(frase);
        exibir(palavras);
    }public static String[] mapeamento(String frase){
        String[] palavras = frase.split(" ");
        return palavras;
    }public static void exibir(String[]palavras){
        System.out.println("SUA FRASE TEM "+(palavras.length )+ " PALAVRAS");
        for(String item : palavras){
            System.out.println(item);
        }
    }
}
    