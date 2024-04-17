import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();

        if (ehprimo(num)) {
            System.out.println("É NUMERO PRIMO");
        } else {
            System.out.println("Não é numero primo");
        }
    }public static boolean ehprimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
