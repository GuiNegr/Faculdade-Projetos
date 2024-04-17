package ado10;
import java.util.Scanner;
public class exe05 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        String[] lista = new String[0];
        String opcao = ler.nextLine();
        while(!opcao.equals("sair")){
            String[] auxiliar = new String[lista.length + 1];
            for(int i = 0; i < lista.length;i++){
                auxiliar[i] = lista[i];
            }
            auxiliar[lista.length] = opcao;
            lista = auxiliar;
            opcao = ler.nextLine();
        }
        for (String string : lista) {
                System.out.println(string);
        }   

    }
    }
