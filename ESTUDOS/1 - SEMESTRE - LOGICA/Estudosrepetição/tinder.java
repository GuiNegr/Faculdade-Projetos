import java.util.Scanner;

public class tinder {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho da array e, em seguida, seus gostos");
        String[] pessoa1 = criararray(ler);
        System.out.println("Informe o tamanho do segundo array e, em seguida, seus gostos");
        String[] pessoa2 = criararray(ler);

        String resp = similares(pessoa1, pessoa2);
        System.out.println(resp);
    }

    public static String[] criararray(Scanner ler) {
        int tm = ler.nextInt();
        ler.nextLine(); // Consume the newline character
        String[] array = new String[tm];
        for (int i = 0; i < array.length; i++) {
            array[i] = ler.nextLine();
        }
        return array;
    }

    public static String similares(String[] pessoa1, String[] pessoa2) {
        int cont = 0;
        String similar1 = "DEU MATCH!";
        String similar2 = "A FILA ANDA!";
        for (int i = 0; i < pessoa1.length; i++) {
            for (int j = 0; j < pessoa2.length; j++) {
                for (String item : pessoa1) {
                    if (item.equals(pessoa2[j])) {
                        cont++;
                    }
                }
            }
        }
        if (cont <= 5) {
            return similar1;
        } else {
            return similar2;
        }
    }
}
