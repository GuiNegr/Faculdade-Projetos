import java.util.Scanner;
public class Ex09 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma frase");
        String msg = ler.nextLine();

        String x = separar(msg);

        System.out.println(x);

    }public static String separar (String msg){
       String resultado = "";
       for(int pos = 0; pos < msg.length(); pos++){
        char letra = msg.charAt(pos);
        resultado = letra + resultado;
       }
        return resultado;
    }
}
