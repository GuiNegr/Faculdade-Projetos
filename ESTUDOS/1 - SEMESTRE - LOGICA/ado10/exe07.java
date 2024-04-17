package ado10;
import java.util.Scanner;
public class exe07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe quantos pilostos vão ser:");
        int tmn = ler.nextInt();
        System.out.println("Informe as posições iniciais");
        int[] pilotos = Criararray(ler, tmn);
        System.out.println("Informe as posições finais");
        int[] pilotosfim = Criararray(ler, tmn);

        String[] resultado = checararray(pilotos, pilotosfim, tmn);

        for(int i = 0; i < resultado.length; i++){
            System.out.println("O PILOTO NA POSIÇÃO "+(i +1)+" "+resultado[i]);
        }

    }public static int[]Criararray(Scanner ler, int tmn){
        int[] array = new int[tmn];
        for(int i = 0; i < array.length;i++){
            array[i] = ler.nextInt();
        }
        return array;
    }public static String[] checararray(int[]pilotos, int[]pilotosfim, int tmn){
        String[] array = new String[tmn];
        for(int i = 0; i < array.length; i++){
            if(pilotos[i] > pilotosfim[i]){
                array[i] = "RETROCEDEU";
            }else if(pilotos[i] < pilotosfim[i]){
                array[i] = "AVANÇOU";
            }else if(pilotos[i] == pilotosfim[i]){
                array[i] = "MANTEVE";
            }
        }
        return array;
    }
}
