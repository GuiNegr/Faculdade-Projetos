package ADO09;
import java.util.Scanner;
public class Exe04{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int[]lista = criararray(ler);
        Exibir(lista);
    }public static int[] criararray(Scanner ler){
        System.out.println("INFORME O TAMANHO DA ARRAY");
        int qntd = ler.nextInt();
        int[] lista = new int[qntd];
        for(int i = 0; i < lista.length; i++){
            System.out.println("INFORME UM NUMERO:");
            lista[i] = ler.nextInt();
        }
        return lista;
    }public static void Exibir(int[]lista){
        System.out.println("O NUMERO INFOMRADOS PARA O ARRAY FOI: ");
        for(int item : lista){
            System.out.println(item);
        }
    }
}