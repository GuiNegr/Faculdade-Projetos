package ado10;
import java.util.Scanner;
public class exe04 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do array pra conter a escala");
        int tmn = ler.nextInt();
        int[] lista = criararray(tmn);
        exibir(lista);
        ler.close();
    }public static int[] criararray(int tmn){
        int[] lista = new int[tmn];
        int a = 0;
        int b = 1;
        int aux;
        for(int i = 0; i < tmn; i++){
            aux = a;
            a = a + b;
            b = aux;
            lista[i] = a;
        }
        return lista;
    }public static void exibir(int[] lista){
        for(int item : lista){
            System.out.println(item);
        }
    }
}

