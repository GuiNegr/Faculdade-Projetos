import java.util.Scanner;
class Ex03{
  public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero");
    int resp = sc.nextInt();

    int x = somapar(resp);

    System.out.println(x);
    
  }public static int somapar(int num){
    int cont = 0;
    int soma = 0;
    while(cont <= num){
      if(cont % 2 == 0){
        soma = cont + soma;
      }
      cont++;
    }
    return soma;
  }
}
