package TODASASADO;
import java.util.Scanner;
public class exe0901 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("INFORME AS NOTAS");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int num3 = ler.nextInt();
        int media = (num1 + num2 + num3) / 3;
        System.out.println("SUA MEDIA É "+media);
        ler.close();
    }
}
