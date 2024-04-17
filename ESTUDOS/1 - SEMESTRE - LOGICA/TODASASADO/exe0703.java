package TODASASADO;
import java.util.Scanner;
public class exe0703 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("QUAL É O SEU PESO??");
        double peso = ler.nextInt();
        System.out.println("Qual é a sua altura?");
        double altura = ler.nextDouble();
        
        double imc = peso / (altura * altura);

        boolean status = false;

        if(imc >= 24.69){
            status = true;
        }

        System.out.println("Qual é o seu imc? "+imc);
        System.out.println("VOCE ESTÁ ASSIMA DO PESO? "+status);
        ler.close();
    }
}
