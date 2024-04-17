import java.util.Scanner;
public class EX07ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe um numero:");
        int tamanho = ler.nextInt();



        quadrado(tamanho);
    }public static void quadrado(int tamanho){
        
        int volta = 1;
        while(tamanho >= volta){
        int cont = 1;
        while(cont <= tamanho){
            System.out.print("* ");
            cont++;
        } 
        System.out.println();
        volta++;
    }
    }
    }
    
