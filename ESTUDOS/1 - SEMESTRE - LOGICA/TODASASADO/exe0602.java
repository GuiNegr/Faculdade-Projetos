package TODASASADO;
import java.util.Scanner;
public class exe0602 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("INFORME A CAPACIDADE DO TANQUE");
        int cap = ler.nextInt();
        System.out.println("INFORME O CONSUMO DO CARRO");
        int carro = ler.nextInt();
        System.out.println("INFORME QUANTOS KM DE VIAGEM");
        int km = ler.nextInt();

        int dist = cap * carro;
        int pard = (km / dist) + 1;
        System.out.println("VOCÉ FARÁ "+pard+ " PARADAS");
        ler.close();
    }
}
