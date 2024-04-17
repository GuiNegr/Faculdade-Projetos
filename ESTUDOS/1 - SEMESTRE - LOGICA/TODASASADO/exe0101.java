package TODASASADO;
import java.util.Scanner;
public class exe0101 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO");
        int num = ler.nextInt();
        System.out.println("INFORME OUTRO NUMERO");
        int num2 = ler.nextInt();

        int soma = num + num2;

        System.out.println("A SOMA FOI DE "+soma);
        ler.close();
    }
}
