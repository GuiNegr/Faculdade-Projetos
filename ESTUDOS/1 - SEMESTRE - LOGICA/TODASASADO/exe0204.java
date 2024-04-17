
package TODASASADO;
import java.util.Scanner;
public class exe0204 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        double num = ler.nextDouble();

        double dobro = dobro(num);

        System.out.println(dobro);
        ler.close();
    }public static double dobro(double num){
        double dobro = num * 2;
        return dobro;
    }
}
