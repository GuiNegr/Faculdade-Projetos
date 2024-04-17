import java.util.Scanner;
public class separadorserin {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma frase");
        String frase = ler.nextLine();

        String aux = "";
        char vazio = ' ';
        for(int i = 0; i < (frase.length());i++){
            vazio = frase.charAt(i);
            if(vazio == ' '){

            }else{
                aux = aux + vazio;
                if(i != frase.length() - 1 ){
                    aux = aux + "-";
                }
            }
        }
        System.out.println(aux.toUpperCase());
    }
}
