import java.util.Scanner;
public class EX01ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num = ler.nextInt();

        contar(num);

    }public static void contar(int num){
        int cont = 1;
        while(num >= cont){
            System.out.println(cont);
            cont++;
        }
    }
}
