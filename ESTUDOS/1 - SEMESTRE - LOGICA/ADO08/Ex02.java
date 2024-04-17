import java.util.Scanner;
class Ex02{
  public static void main(String[]arg){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe um valor:");
    int resp = ler.nextInt();
    int x = Fatorial(resp);
    System.out.println(x);
  }public static int Fatorial(int num){
    int cont = 1;
    int fator = 1;
    while(cont <= num){
      fator = cont * fator;
      cont++;
    }
    return fator;
  }
}