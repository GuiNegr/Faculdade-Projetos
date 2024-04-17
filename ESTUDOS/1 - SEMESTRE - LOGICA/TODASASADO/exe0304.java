package TODASASADO;
import java.util.Scanner;
public class exe0304 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe as notas");
        double nota = ler.nextDouble();
        double nota1 = ler.nextDouble();
        double nota2 = ler.nextDouble();

        double media = media(nota, nota2, nota1);

        System.out.println(media);
        ler.close();
    }public static double media (double nota, double nota2, double nota1){
       double media = (nota + nota1 + nota2) / 3;
       return media;
    }
}
