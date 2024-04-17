import java.util.Scanner;
public class exequadrado{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do quadrado");
        int linha = ler.nextInt();

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < linha; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}