package ADO09;
import java.util.Random;
import java.util.Scanner;
public class Exe10 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME O TAMANHO DO ARRAY");
        int num = ler.nextInt();
        
        int[] lista = lista(ler, num);
        int[] inverter = inverter(lista, num);
        exibir(inverter);
    }public static int[] lista(Scanner ler, int num){
        int[] lista = new int[num];
        for(int i = 0; i < lista.length; i++){
            System.out.println("INFORME O NUMERO DE POISÇÃO "+(i+1));
            lista[i] = ler.nextInt();
        }
        return lista;
    }public static int[] inverter(int[]lista, int num){
        int[] inverter = new int[num];
        int pos = lista.length - 1;
        int i = 0;
        while(pos >= 0){
            inverter[pos] = lista[i];
            i++;
            pos--;
        }
        return inverter;
    }public static void exibir(int[] inverter){
        System.out.println();
        for(int item : inverter){
            System.out.println(item);
        }
    }
}   
