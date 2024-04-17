import java.util.Scanner;
public class Es01{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = ler.nextInt();

        conta(num);

    }public static void conta(int num){
        int cont = 1;
        while(cont <= num){
            System.out.println(cont);
            cont++;
        }
    }
}