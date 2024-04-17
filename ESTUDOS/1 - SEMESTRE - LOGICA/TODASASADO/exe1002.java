package TODASASADO;
import java.util.Scanner;
public class exe1002 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME O SALARIO BASE");
        double salario = ler.nextDouble();
        System.out.println("INFORME O BONUS EM PORCENTAGEM");
        double bonus = ler.nextDouble();
        System.out.println("INFORME O DESCONTO");
        double desc = ler.nextDouble();

       double bons = (bonus * salario) / 100;

       double finals = (salario + bons) - desc;
       System.out.println(finals);
       ler.close();

    }
}
