import java.util.Scanner;
public class triangulo{
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("INFORME UMA FRASE");
        String frase = ler.nextLine();

        Boolean status = palindromo(frase); 

        if(status == false){
            System.out.println("NÃO É UM PALINDROMO");
        }else if(status == true){
            System.out.println("É UM PALINDROMO");
        }

    }public static boolean palindromo(String frase){
        String resultado = "";
        Boolean status = false;
        for(int i = 0; i < frase.length();i++){
            char letra = frase.charAt(i);
            resultado = letra + resultado;
        }
        if(frase.equals(resultado)){
            status = true;
        }else{}
        return status;
    }
}