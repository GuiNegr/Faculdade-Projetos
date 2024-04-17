package TODASASADO;
import java.util.Scanner;
public class exe1003 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME O DIAMENTRO E ALTURA DO PRIMEIRO CILINDRO;");
        int dia1 = ler.nextInt();
        int alt1 = ler.nextInt();

        System.out.println("INFORME O DIAMENTRO E ALTURA DO SEGUNDO CILINDRO;");
        int dia2 = ler.nextInt();
        int alt2 = ler.nextInt();
        
        double v1 = 3.14 * (dia1 * dia1) * alt1;
        double v2 = 3.14 * (dia2 * dia2) * alt2;

        System.out.println("O VOLUME DO PRIMEIRO CILINDRO É "+v1);
        System.out.println("O VOLUME DO SEGUNDO CILINDRO É "+v2);

        boolean status = false;

        if(v1 > v2){
            status = true;
        }

        System.out.println("é possivel transferir o primeiro para o segundo? "+status);
        ler.close();

    }
}
