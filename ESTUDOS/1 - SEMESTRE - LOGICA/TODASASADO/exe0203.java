package TODASASADO;
import java.util.Scanner;
public class exe0203 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe as 3 notas");
        double notas = ler.nextDouble();
        double notas2 = ler.nextDouble();
        double notas3 = ler.nextDouble();

        double media = (notas + notas2 + notas3) / 3;
        boolean status = false;

        if(media >= 6){
            status = true;
        }
            System.out.println("A MEDIA DO ALUNO É "+media);
            System.out.println("O ALUNO ESTÁ APROVADO?"+status);
            ler.close();        
    }
}
