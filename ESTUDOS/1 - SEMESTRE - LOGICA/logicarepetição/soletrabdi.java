import java.util.Scanner;
public class soletrabdi {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME A FRASE");
        String frase = ler.nextLine();

        for(int i = 0; i < frase.length();i++){
            char vazio = frase.charAt(i);
            System.out.println(vazio);
        }
    }
}
