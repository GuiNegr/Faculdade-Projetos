import java.util.Scanner;
public class ex13 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME A POSIÇÃO DESEJADA");
        int pos = ler.nextInt();
        int a = 0;
        int b = 1;
        int aux = 0;
        for(int i = 0; i < pos; i++){
            aux = a;
            a = a+b;
            b = aux;
        }
        System.out.println(a);
        ler.close();
        
    }
}
