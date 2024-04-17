import java.util.Scanner;
import java.util.Random;

public class Main{
    static Paciente novo = null;
    static Fila fila = new Fila(1);

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("1 - EMERGENCIA");
            System.out.println("2 - PACIENTE NORMAL");
            System.out.println("3 - CHAMAR PACIENTE");
            System.out.println("4 - Informações da fila");
            System.out.println("5 - Sair");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    novo = new Paciente();
                    novo.add(1);
                    novo.setNome(geranomes());
                    fila.add(novo);
                    break;
                case 2:
                    novo = new Paciente();
                    novo.add(2);
                    novo.setNome(geranomes());
                    fila.add(novo);
                    break;
                case 3:
                    fila.desenfileira();
                    break;
                case 4:
                    fila.informaçoes();
                    break;
                case 5:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }

    public static String geranomes() {
        Random rd = new Random();
        String nome = "";
        String[] nomes = {"João", "Pamela", "Denis",
                "Romulo", "Jennifer", "Daniel",
                "Max Payne", "Gato de botas", "Ana", "Vitoria", "Genuscleude",
                "Luiz","Mr.Clinston","Client estWood"
        };
        int j = rd.nextInt(14);
        return nome = nomes[j];
    }
}