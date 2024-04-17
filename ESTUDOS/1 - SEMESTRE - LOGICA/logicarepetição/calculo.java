import java.util.Scanner;
public class calculo{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe qntas bolinha");
        String cont = ler.nextLine();
        contar(cont);
    }public static void contar(String cont){
        char vazio = ' ';
        int cont1 = 0;
        for(int i = 0; i < cont.length();i++){
            vazio = cont.charAt(i);
            if(vazio == ' '){
                System.out.println("espaço");
                cont1--;
            }else{
                cont1++;
                System.out.println("LETRA "+(cont1+1)+" = "+vazio);
            }
        }
    }
}