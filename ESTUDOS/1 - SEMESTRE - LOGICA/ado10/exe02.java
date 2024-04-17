package ado10;
import java.util.Scanner;
public class exe02 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho do array");
        int tmn = ler.nextInt();
       int[] lista = criararray(tmn, ler);
       String x  = identificar(lista);
       System.out.println(x);
    }public static int[] criararray(int tmn, Scanner ler){
        int[] lista = new int[tmn];
        for(int i = 0;i < lista.length; i++){
            lista[i] = ler.nextInt();
        }
        return lista;
    }public static String identificar(int[]lista){
        boolean crescente = true;
        boolean decrescente = true;
        String vazio = "";
        for(int i = 0; i < lista.length - 1; i++){
            if(lista[i] < lista[i + 1]){
                crescente = false;
            }else if(lista[i] > lista[i + 1]){
               decrescente = false;
            }
            }
            if (crescente) {
                vazio = "crescente";
            } else if (decrescente) {
                vazio = "decrescente";
            } else {
                vazio = "desordenado";
            }
        
        return vazio;
    }
}
