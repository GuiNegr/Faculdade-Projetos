package TODASASADO;
import java.util.Scanner;
public class exe0404 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu salario");
        double salario = ler.nextDouble();

        System.out.println("Informe o bonus");
        double bonus = ler.nextDouble();

        System.out.println("Informe o desconto");
        double desc = ler.nextDouble();

        double liquido = liquido(salario, bonus, desc);

        System.out.println(liquido);
        ler.close();
    }public static double liquido(double salario, double bonus, double desc){
        double bonusdesc = (bonus * salario) / 100;
        double salarioo = desc - (salario + bonusdesc);
        return salarioo;
    }
}
