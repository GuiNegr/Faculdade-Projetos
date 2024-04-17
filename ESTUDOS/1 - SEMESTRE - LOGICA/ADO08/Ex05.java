import java.util.Scanner;
class Ex05{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        System.out.println("Informe um começo:");
        int inicio = ler.nextInt();
        System.out.println("Informe um fim:");
        int fim = ler.nextInt();
        int x = somarmultiplos(num,inicio,fim);
        System.out.println(x);

    }public static int somarmultiplos(int num, int inicio, int fim){
        int resu = 0;
        while(inicio <= fim){
            if(inicio % num == 0){
                resu += inicio;
            }
            inicio++;
        }
        return resu;
    }
    }
    

