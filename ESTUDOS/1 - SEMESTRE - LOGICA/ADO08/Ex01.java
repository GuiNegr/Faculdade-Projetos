import java.util.Scanner;

class Ex01 {
  public static void main(String[] arg) {
    Scanner ler = new Scanner(System.in);
    System.out.println("##MAQUINA DE SOMAS##");
    System.out.println("Informe um numero:");
    int resp = ler.nextInt();
    int x = Somarate(resp);
    System.out.println(x);

  }

  public static int Somarate(int resp) {
    int cont = 0;
    int resu = 0;
    while (cont <= resp) {
      resu = resu + cont;
      cont++;
    }
    return resu;
  }
}