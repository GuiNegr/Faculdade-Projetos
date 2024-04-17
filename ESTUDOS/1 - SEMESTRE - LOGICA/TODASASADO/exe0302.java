package TODASASADO;
import java.util.Scanner;
public class exe0302 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantos kg ira converter");
        double kg = ler.nextDouble();

        double gramas = kg * 1000;

        System.out.println(gramas);
        ler.close();
    }
}
