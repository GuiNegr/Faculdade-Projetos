import java.util.Scanner;
public class exeretangulo {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do retangulo");
        int tam = ler.nextInt();

        System.out.println("Informe a largura do retangulo");
        int larg = ler.nextInt();

        for(int i = 0; i < tam; i++){
            for(int j = 0; j < larg; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
