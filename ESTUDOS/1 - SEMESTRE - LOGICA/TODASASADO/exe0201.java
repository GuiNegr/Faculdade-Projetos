
package TODASASADO;
import java.util.Scanner;
public class exe0201 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO");
        int num = ler.nextInt();

        int dobro = num * 2 ;
        System.out.println("O NUMERO DOBRADO FOI:"+dobro);
        ler.close();
    }
}
