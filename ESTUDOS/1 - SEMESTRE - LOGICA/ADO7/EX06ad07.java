import java.util.Scanner;
public class EX06ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        int num = ler.nextInt();
        
        linha(num);
    }public static void linha(int num){
        int cont = 1;
        while (cont <= num){
            System.out.print("* ");
            cont++;
        }
    }

    }
    
