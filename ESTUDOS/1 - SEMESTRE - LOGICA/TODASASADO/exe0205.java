package TODASASADO;
import java.util.Scanner;
public class exe0205 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe as notas");
        double nota1 = ler.nextDouble();
        double nota2 = ler.nextDouble();
        double nota3 = ler.nextDouble();

        double media = media(nota1,nota2,nota3);
        boolean status = status(media);

        System.out.println("A MEDIA DO ALUNO É "+media);
        System.out.println("O ALUNO ESTÁ APROVADO?"+status);
        ler.close();
    }public static double media(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }public static boolean status(double media){

        boolean status = false;

        if(media >= 6){
            status = true;
        }
        return status;
    }
}
