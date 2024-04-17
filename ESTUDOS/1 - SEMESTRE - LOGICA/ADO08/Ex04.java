import java.util.Scanner;
class Ex04{
  public static void main(String[]args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o valor de inicio:");
    int inicio = ler.nextInt();

    System.out.println("Informe o valor de final: ");
    int fim = ler.nextInt();
    
    int x = soma(inicio, fim);
    
    System.out.println(x);
    
  } public static int soma(int inicio, int fim){
    int soma = 0;
    while(fim >= inicio){
    if (inicio %2 == 0 ){
      soma += inicio;
    }
      inicio++;
    }
    return soma;
  }
}