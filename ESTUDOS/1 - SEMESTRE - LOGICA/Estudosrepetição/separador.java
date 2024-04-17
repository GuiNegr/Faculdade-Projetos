import java.util.Scanner;
public class separador {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma frase");
        String frase = ler.nextLine();
        char letra = ' ';
        String fras = " ";
        for(int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            fras = fras + letra + "-";
        }
        System.out.println(fras);
    }
}
