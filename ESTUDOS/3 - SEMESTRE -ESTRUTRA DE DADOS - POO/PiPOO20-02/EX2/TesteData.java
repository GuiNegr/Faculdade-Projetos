package EX2;
import java.util.Scanner;
public class TesteData {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        data date = new data();

        System.out.println("Informe o Ano");
        int Ano = ler.nextInt();

        date.SetAno(Ano);

        System.out.println("Informe o Mês");
        byte mes = ler.nextByte();

        date.ajustarmes(mes);

        System.out.println("Informe o Dia");
        byte dia = ler.nextByte();

        date.setDia(dia);


        date.imprimir(Ano, dia, mes);
        ler.close();
    }
}
