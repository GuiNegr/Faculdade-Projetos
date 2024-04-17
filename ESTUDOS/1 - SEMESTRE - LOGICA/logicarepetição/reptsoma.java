import java.util.Scanner;
public class reptsoma{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("INFOMRE O COMEÇO");
        int start = ler.nextInt();
        System.out.println("INFORME O FIM");
        int fim = ler.nextInt();
        int x = soma(start,fim);
        System.out.println(x);
    }public static int soma(int start, int fim){
        int soma = 0;
        for(; start <= fim; start++){
            if(start % 2 == 0){
                soma += start;
            }
        }
        return soma;
    }
}