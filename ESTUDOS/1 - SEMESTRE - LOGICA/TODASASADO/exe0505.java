package TODASASADO;
import java.util.Scanner;
public class exe0505 {
   public static void main(String[]args){
    Scanner ler = new Scanner(System.in);

    System.out.println("INFORME UMA SENHA");
    String senha = ler.nextLine();

    boolean tamanho = tamanho(senha);
    boolean check = check(senha);
    boolean numcheck = numcheck(senha);
    boolean checkfinal = checkfinal(tamanho, check, numcheck);
    System.out.println("a senha é forte? "+checkfinal);
    ler.close();

   }public static boolean tamanho(String senha){
    boolean status = false;
    if(senha.length() > 6){
        status = true;
    }
    return status;
   }public static boolean check(String senha){
    boolean status = false;
    if(senha.contains("!")|| 
    senha.contains("@") || 
    senha.contains("#")
    || senha.contains("$")
     || senha.contains("%")
      || senha.contains("¨")
      ||senha.contains("&")|| 
      senha.contains("*")
       || senha.contains("(")
        || senha.contains(")")
         || senha.contains("-") || 
    senha.contains("_")){
        status = true;
    }
    return status;
   }public static boolean numcheck(String senha){
    boolean status = false;
    if(senha.contains("1")|| 
    senha.contains("2")|| 
    senha.contains("3")|| 
    senha.contains("4") || 
    senha.contains("5") || 
    senha.contains("6") || 
    senha.contains("7") || 
    senha.contains("8") || 
    senha.contains("9") || 
    senha.contains("0")){
        status = true;
    }
    return status;
   }public static boolean checkfinal(boolean tamanho, boolean check, boolean numcheck){
    boolean status = false;
    if(tamanho == true && check == true && numcheck == true){
        status = true;
    }
    return status;
   }
}
