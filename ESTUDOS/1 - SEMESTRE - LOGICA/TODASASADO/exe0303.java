package TODASASADO;
import java.util.Scanner;
public class exe0303 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado maior do priemiro rentangulo");
        int peri = ler.nextInt();
        System.out.println("Informe o tamanho do lado menor do primeiro rentangulo");
        int peri2 = ler.nextInt();

        System.out.println("Informe o tamanho do lado maior do segundo rentangulo");
        int per3 = ler.nextInt();
        System.out.println("Informe o tamanho do lado menor do segundo rentangulo");
        int peri4 = ler.nextInt();

        int ret = peri * peri2;
        int ret2 = per3 * peri4;
        boolean status = false;

        if(ret == ret2){
            status = true;
        }

        System.out.println("O PRIMEIRO RETANGULO POSSUI A AREA IGUAL A "+ret);
        System.out.println("O SEGUNDO RETANGULO POSSUI A AREA IGUAL A "+ret2);
        System.out.println("OS RETANGULO TEM A MESMA AREA? "+status);
        ler.close();
    }
}
