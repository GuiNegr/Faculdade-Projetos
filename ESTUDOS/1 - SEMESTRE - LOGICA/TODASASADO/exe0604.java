package TODASASADO;
import java.util.Scanner;
public class exe0604 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a area do primeiro triangulo");
        int area1 = ler.nextInt();
        int area2 = ler.nextInt();

        System.out.println("Informe a area do segundo triangulo");
        int area3 = ler.nextInt();
        int area4 = ler.nextInt();
        boolean status = resp(area1, area2, area3, area4);

        System.out.println("os retangulos possuem a mesma area? "+status);
        ler.close();
    }public static boolean resp(int area1, int area2, int area3, int area4){
        boolean status = false;
        int ret = area1 * area2;
        int ret2 = area3 * area4;

        if(ret == ret2 || ret2 == ret){
            status = true;
        }
        return status;
    }
}
