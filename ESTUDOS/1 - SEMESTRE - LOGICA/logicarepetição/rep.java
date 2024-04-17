import java.util.Scanner;
public class rep {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numero");
        int num = ler.nextInt();
        System.out.println("Informe a potencia");
        int pot = ler.nextInt();
             int x = potencia(num, pot);
        if(num < 0 || pot < 0){
            System.out.println("CALCULO INVALIDO");
        }else if(pot == 0){
            x = 1;
            System.out.println(x);
        }else{
           System.out.println(x);
        }
    }public static int potencia(int num, int pot){
        int potresu = num;
            for(int i = 1; i < pot; i++){
                potresu = potresu * num;
            }
        return potresu;
    }
}
