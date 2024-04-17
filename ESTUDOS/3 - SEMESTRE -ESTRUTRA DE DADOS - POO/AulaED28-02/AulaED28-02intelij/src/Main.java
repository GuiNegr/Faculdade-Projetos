//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] array = new double[7];
        double media = 0;


        System.out.println("INFORME A TEMPERATURA");
        for (int i = 0; i < array.length; i++){
            double info = ler.nextInt();
            array[i] = info;
            media += info;
        }
        media = media / 7;

        double acima = array[0];
        double abaixo = array[0];

        for(int i = 0; i < array.length; i++){
            if(acima < array[i]) {
            acima = array[i];
            }
            if(abaixo > array[i]){
                abaixo = array[i];
            }
            }
            double i = 1;
        System.out.println("Á MEDIA DE TEMPERATURAS É: "+media);
        System.out.println("Á MAIOR TEMPERATURA FOI: "+acima);
        System.out.println("Á MENOR TEMPERATURA FOI: "+abaixo);
        for(double item : array){
            System.out.println("A TEMPERATURA NA POSIÇÃO: "+i+ " É = "+item);
            i++;
        }
        }
    }
