package TODASASADO;
import java.util.Scanner;
public class exe0305 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME AS MEDIDAS DO PRIMEIRO TRIANGULO");
        int area = ler.nextInt();
        int area2 = ler.nextInt();
        int z = arearet(area, area2);

        System.out.println("INFORME AS MEDIDAS DO SEGUNDO TRIANGULO");
        int area3 = ler.nextInt();
        int area4 = ler.nextInt();
        int x = arearet(area4, area3);

        boolean status = resp(z, x);


        System.out.println("OS RETANGULOS SÃO IGUAIS?"+status);
        ler.close();
    }public static int arearet(int area, int area2){
        int ret = area * area2;
        return ret;
    }public static boolean resp (int z , int x){
        boolean status = false;

        if (z == x){
            status = true;
        }
        return status;
    }
}
