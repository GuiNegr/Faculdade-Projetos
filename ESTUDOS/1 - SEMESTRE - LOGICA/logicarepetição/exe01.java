
import java.util.Scanner;
public class exe01{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe até onde somar");
        int max = ler.nextInt();
        int x = soma(max);
        System.out.println(x);
        ler.close();
    }public static int soma(int max){
        int c = 0;
        for(int i = 1; i <= max; i++){
            c = c + i;
        }
        return c;
    }
}