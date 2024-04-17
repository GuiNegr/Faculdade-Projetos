import java.util.Scanner;
public class EX09ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("MAQUINA DE TABUADAS");
        System.out.println("INFORME UM NUMERO: ");
        int num = ler.nextInt();
        tabuada(num);
    }public static void tabuada(int num){
        int cont = 1;

        while(cont <= 10){
            int conta = cont * num;
            System.out.println(num+" X "+cont+" = "+conta);
            cont++;
        }
    }
}
