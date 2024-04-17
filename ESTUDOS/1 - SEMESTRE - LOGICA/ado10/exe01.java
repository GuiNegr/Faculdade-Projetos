package ado10;
import java.util.Scanner;
public class exe01 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do array");
        int tmn = ler.nextInt();

        int[] lista = criararray(tmn, ler);
        lista = inverterarray(lista, tmn);
        exibir(lista);

        ler.close();
        
    }public static int[] criararray(int tmn, Scanner ler){
        int[] lista = new int[tmn];
        for(int i = 0; i < lista.length; i++){
            lista[i] = ler.nextInt();
        }
        return lista;
    }public static int[] inverterarray(int[] lista, int tmn){
        for(int i = 0; i <tmn /2 ; i++){
            int temp = lista[i];
            lista[i] = lista[tmn - 1 - i];
            lista[tmn - 1 - i] = temp;
        }
        return lista;
    }public static void exibir(int[] lista){
        for(int item : lista){
            System.out.println(item);
        }
    }
    }
