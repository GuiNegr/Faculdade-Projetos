
package ADO09;
import java.util.Scanner;
class Exe01 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        int[] numeros = new int[5];
        chamada(ler,numeros);
        exibir(numeros);

    }public static void chamada(Scanner ler, int[]numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("INFORME UM NUMERO PARA A POSIÇÃO "+(i+1)+":");
            numeros[i] = ler.nextInt();
        }
    }public static void exibir(int[]numeros){
        System.out.println("OS NUMEROS INFORMADOS PARA A ARRAY FOI:");
        for(int item : numeros){
            System.out.println(item);
        }
    }
}
