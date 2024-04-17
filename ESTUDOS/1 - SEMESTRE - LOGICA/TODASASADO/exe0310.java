package TODASASADO;
import java.util.Scanner;
public class exe0310 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("INFORME O TAMANHO DO ARRAY");
        int tam = ler.nextInt();
        int[] lista = new int[tam];

        for(int i = 0; i < lista.length; i++){
            lista[i] = ler.nextInt();
        }
        boolean crescente = true;
        boolean decrescente = true;
        
        for(int i = 0; i < lista.length - 1; i++){

            if(lista[i] > lista[i + 1]){
                crescente = false;
            }else if( lista[i] < lista[i + 1]){
               decrescente = false;
            }
        }
        if (crescente) {
            System.out.println("Ordem crescente");
        } else if (decrescente) {
            System.out.println("Ordem decrescente");
        } else {
            System.out.println("Ordem não definida");
        }

    }
}
