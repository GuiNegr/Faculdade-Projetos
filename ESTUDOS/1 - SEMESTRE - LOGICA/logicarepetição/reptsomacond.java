import java.util.Scanner;
public class reptsomacond{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o parametro");
        int para = ler.nextInt();
        System.out.println("INFOMRE O COMEÇO");
        int start = ler.nextInt();
        System.out.println("INFORME O FIM");
        int fim = ler.nextInt();
        int x = soma(start,fim,para);
        System.out.println(x);
    }public static int soma(int start, int fim, int para){
        int soma = 0;
        for(; start <= fim; start++){
            if(start % para == 0){
                soma += start;
            }
        }
        return soma;
    }
}