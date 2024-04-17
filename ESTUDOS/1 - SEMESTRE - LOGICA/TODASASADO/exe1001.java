package TODASASADO;
import java.util.Scanner;
public class exe1001 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("INFORME AS NOTAS");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int num3 = ler.nextInt();
        int num4 = ler.nextInt();
        int num5 = ler.nextInt();
        int media = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("SUA MEDIA É "+media);
        ler.close();
    }
}
