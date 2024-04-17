package TODASASADO;
import java.util.Scanner;
public class exe0904 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira uma frase");
        String nome = ler.nextLine();
        
       String frase = frase(nome);

       System.out.println(frase);
       ler.close();
    }public static String frase(String nome){
        String nome1 =  nome.replace('a' , 'i');
        String nome2 = nome1.replace('e' , 'i');
        String nome3 = nome2.replace('i' , 'i');
        String nome4 = nome3.replace('o' , 'i');
        String nome5 = nome4.replace('u' , 'i');
       return nome5;
    }
}
