package ADO09;
import java.util.Random;
import java.util.Scanner;
public class Exe08 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("INFORME O TAMANHO DA ARRAY: ");
        int tamanho = ler.nextInt();

        int[] numeros = criararray(ler, rand, tamanho);
        System.out.println("INFORME UM NUMERO PARA SER ENCONTRADO");
        int num = ler.nextInt();

        int x = buscar(numeros,num);
        exibir(numeros);

        System.out.println();
        if(x == -1){
            System.out.println("SEU NUMERO NÃO FOI ENCONTRADO");
        }else{
            System.out.println("O NUMERO "+num+ "A POSIÇÃO É "+x);
        }        
    }public static int[] criararray(Scanner ler, Random rand,int tamanho){
        int[] numeros = new int[tamanho];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(10);
        }
        return numeros;
    }public static int buscar(int[]numeros, int num){
        int pos = -1;
        for(int i = 0; i < numeros.length; i++){
            int item = numeros[i];
            if (num == item){
                pos = i;
            }
        }
        return pos;
        }public static void exibir(int[] numeros){
            for(int item : numeros){
                System.out.print(item);
            }
        }
    }