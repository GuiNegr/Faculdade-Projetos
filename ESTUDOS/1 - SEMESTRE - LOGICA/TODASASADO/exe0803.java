package TODASASADO;
import java.util.Scanner;
public class exe0803 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);


        System.out.println("QUAL É O NOME DO LIVRO?");
        String nome = ler.next();

        System.out.println("Quantos segundos para ler a pagina?");
        int seg = ler.nextInt();

        System.out.println("Quantas paginas?");
        int pag = ler.nextInt();

        double livro = pag * seg;

        double formula = livro / 3600;

        System.out.println("O LIVRO "+nome+ " SERÁ TERMINADO EM "+formula+" horas");
        ler.close();


    }
}
