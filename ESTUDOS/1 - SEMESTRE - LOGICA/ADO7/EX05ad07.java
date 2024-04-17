import java.util.Scanner;
public class EX05ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        pares(num);
   
    }public static void pares(int num){
        int cont = 1;
        while(cont <= num){
            if(cont % 2 == 0){
                System.out.println(cont);
            }cont++;
        }
    }
}
