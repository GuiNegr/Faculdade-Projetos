package TODASASADO;
import java.util.Scanner;
public class exe0103 {
 public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    
    boolean status = false;

    System.out.println("INFORME A TEMPERATURA");
    double temp = ler.nextDouble();

    if(temp >= 37.5){
        status = true;
    }else {

    }
    System.out.println("VOCE ESTÁ COM FEBRE? "+status);
    ler.close();     
 }   
}
