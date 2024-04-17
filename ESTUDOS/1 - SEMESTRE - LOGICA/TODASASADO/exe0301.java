package TODASASADO;
import java.util.Scanner;
public class exe0301 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO");
        int num = ler.nextInt();

        int triplo = num * 3;
        System.out.println("O TRIPLO DO SEU NUMERO É "+triplo);
        ler.close();
    }
}
