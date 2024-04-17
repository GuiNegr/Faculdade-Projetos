import java.util.Scanner;
public class Ex07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma frase");
        String msg = ler.nextLine();

        String x = separar(msg);

        System.out.println(x);

    }public static String separar (String msg){
        String resultado = "";
        int pos = 0;
        while(pos < msg.length()){
            char letra = msg.charAt(pos);
            resultado = resultado + letra + "-";
            pos++;
        }
        return resultado;
    }
}
