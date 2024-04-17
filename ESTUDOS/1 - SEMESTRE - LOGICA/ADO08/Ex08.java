import java.util.Scanner;
public class Ex08 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma mensagem: ");
        String msg = ler.nextLine().toUpperCase().replaceAll(" ", "");
        int i = 0;
        while (i < msg.length() - 1) {
            System.out.print(msg.charAt(i) + "-");
            i++;
        }
        System.out.println(msg.charAt(i));

    }
}
