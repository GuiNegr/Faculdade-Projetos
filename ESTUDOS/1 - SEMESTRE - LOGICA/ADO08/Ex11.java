import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a nota");
        double nota = ler.nextDouble();

        System.out.println("Informe a segunda nota");
        double nota2 = ler.nextDouble();

        System.out.println("Informe a terceira nota");
        double nota3 = ler.nextDouble();

        nota = pedirnota(nota);
        nota2 = pedirnota2(nota2);
        nota3 = pedirnota3(nota3);

        double x = calcularnota(nota, nota2, nota3);
        System.out.println(x);
    }
    public static double pedirnota(double nota) {
        Scanner ler = new Scanner(System.in);
        while (nota < 0 || nota >= 11) {
            System.out.println("Primeira nota inválida, insira novamente:");
            nota = ler.nextDouble();
        }
        return nota;
    }

    public static double pedirnota2(double nota2) {
        Scanner ler = new Scanner(System.in);
        while (nota2 < 0 || nota2 >= 11) {
            System.out.println("Segunda nota inválida, insira novamente:");
            nota2 = ler.nextDouble();
        }
        return nota2;
    }

    public static double pedirnota3(double nota3) {
        Scanner ler = new Scanner(System.in);
        while (nota3 < 0 || nota3 >= 11) {
            System.out.println("Terceira nota inválida, insira novamente:");
            nota3 = ler.nextDouble();
        }
        return nota3;
    }public static double calcularnota(double nota, double nota2, double nota3){
        double cal = (nota + nota2 + nota3) / 3;
        return cal;
    }
}
