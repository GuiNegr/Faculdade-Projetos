package ADO09;
import java.util.Scanner;
public class Exe05 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        // o usario ta criando o tamanho da array
        System.out.println("INFORME UMA QUANTIDADE:");
        int qntd = ler.nextInt();
        int [] lista = new int[qntd];

        // chamada das função
        inserir(ler,lista);
        int[] dobro = calculadobro(lista, qntd);
        exibir(lista, dobro);
    }public static void inserir(Scanner ler, int[]lista){
        System.out.println("INFORME OS VALORES PARA A ARRAY:");
        for(int i = 0; i < lista.length; i++){
            lista[i] = ler.nextInt();
        }
    }public static int[] calculadobro(int[]lista,int qntd){
        int[] dobro = new int[qntd];
        for(int i = 0; i < lista.length; i++){
            dobro[i] = lista[i] * 2; 
        }
        return dobro;
    }public static void exibir(int [] lista, int []dobro){
        System.out.println("SEUS NUMEROS INFORMADOS PARA A PRIMEIRA ARRAY FOI:");
        for(int item : lista){
            System.out.println(item);
        }
        System.out.println("O DOBRO DOS NUMEROS INFORMADOS FOI: ");
        for(int item2 : dobro){
            System.out.println(item2);
        }
}
}
