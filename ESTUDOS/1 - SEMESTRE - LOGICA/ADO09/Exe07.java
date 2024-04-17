package ADO09;
import java.util.Scanner;
public class Exe07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("informe quantas notas");
        int qntd = ler.nextInt();
        double[] notas = criararray(ler, qntd);
        media(notas,qntd);
        double maior = maior(notas);
        double menor = menor(notas);
        exibir(notas);

        System.out.println("SUA MAIOR NOTA FOI: "+maior);
        System.out.println("SUA MENOR NOTA FOI: "+menor);
    }public static double[]criararray(Scanner ler, int qntd){
        double[] notas = new double[qntd];
        for(int i = 0; i < notas.length; i++){
            System.out.println("Insira a nota "+(i+1));
            notas[i] = ler.nextDouble();
        }
        return notas;
    }public static double media(double[] notas, int qntd){
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            notas[i] += media;
        }
        media = media / qntd;
        return media;
    }public static double maior(double[]notas){
        double maior = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        return maior;
    }public static double menor(double[]notas){
        double menor = 10;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        return menor;
}public static void exibir(double[]notas){
    System.out.println("SUAS NOTAS FORAM:");
    for(double item : notas){
        System.out.print(item + " - ");
    }
    System.out.println();
}
}
