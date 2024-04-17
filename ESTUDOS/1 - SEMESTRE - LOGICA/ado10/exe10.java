package ado10;
import java.util.Random;
import java.util.Scanner;
public class exe10 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho da  array");
        int tmnc = ler.nextInt();
        int[] lista = new int[tmnc];
        Random rand = new Random();
      
        for(int i = 0; i< lista.length;i++){
        boolean existe = false;
        int random = rand.nextInt(26);
        int busca = random;
        for(int j = 0; j < lista.length; j++){
            for(int item : lista){
                if(busca == item){
                    existe = true;
                    break;
                }
            }
        }
        if(!existe){
            lista[i] = random;
        }else{
            i--;
        }
        }
        for(int item : lista){
            System.out.print(item +" - ");
        }
    }
    }

    


