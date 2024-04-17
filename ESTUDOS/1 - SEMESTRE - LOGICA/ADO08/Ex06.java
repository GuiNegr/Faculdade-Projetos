import java.util.Scanner;
public class Ex06 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        System.out.println("Informe outro:");
        int expo = ler.nextInt();
        int x = potencia(num,expo);
        if(num < 0 && expo < 0){
            System.out.println("NUMERO INVALIDO");
        }else if(num > 0 && expo > 0){
            System.out.println(x);
        }


    }public static int potencia(int num, int expo){
        int resu = 1;
        int cont = 0;
        while(cont < expo){
            resu *= num;
            cont++;
        }
        return resu;

    }
}
