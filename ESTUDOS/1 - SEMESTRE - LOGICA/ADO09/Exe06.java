package ADO09;
import java.util.Scanner;
public class Exe06 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int numero = ler.nextInt();
        int[]tabuada = tabuada(ler,numero);
        exibir(tabuada);
    }public static int[] tabuada(Scanner ler, int numero){
        int[] tabuada = new int[11];
        for(int i = 0; i < tabuada.length; i++){
            tabuada[i] = numero * i;
        }
        return tabuada;
    }public static void exibir(int[]tabuada){
        for(int item : tabuada){
            System.out.println(item);
        }
    }
}
