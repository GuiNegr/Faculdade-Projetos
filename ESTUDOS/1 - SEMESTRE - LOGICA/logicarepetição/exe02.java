import java.util.Scanner;
public class exe02 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o numero para fatoriar");
        int num = ler.nextInt();
        int x = fatorial(num);
        System.out.println(x);
    }public static int fatorial(int num){
        int c = 1;
        for(int i = 1;i <= num;i++){
            c = c * i;
        }
            return c;
    }
}
