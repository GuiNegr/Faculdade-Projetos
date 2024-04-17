import java.util.Scanner;
public class EX03ad7 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();

        System.out.println("Informe outro numero:");
        int num2 = ler.nextInt();

        contar(num, num2);
        
    }public static void contar(int num, int num2){
        while(num <= num2){
            System.out.println(num);
            num++;
        }
    }
    
}
