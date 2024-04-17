//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Idade nasc = new Idade();
        int respuser = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("INFORME O DIA DE NASCIMENTO");
        respuser = ler.nextInt();
        nasc.setDia(respuser);

        System.out.println("INFORME O ANO DE NASCIMENTO");
        respuser = ler.nextInt();
        nasc.setAno(respuser);

        System.out.println("INFORME O MES DE NASCIMENTO");
        respuser = ler.nextInt();
        nasc.setMes(respuser);

        nasc.Imprimir();
    }
}