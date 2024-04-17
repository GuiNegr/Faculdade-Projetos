import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        
        //variaveis importantes  =D
        matriz matriz = new matriz();
        Scanner ler = new Scanner(System.in);
        int cont = 0;

        System.out.println("Informe o tamanho da matriz quadrada");
        int x = ler.nextInt();

        matriz.Getx(x);
        int MatrizOriginal[][] = matriz.constructor(x);

        while(cont == 0){
        if(x > 0){
            System.out.println("!=============================================================!");
            System.out.println("OQUE DESEJA FAZER?");
            System.out.println("1 - PREENCHER A MATRIZ");
            System.out.println("2 - Fazer a soma geral  da matriz");
            System.out.println("3 - Fazer a soma da diagonal primaria");
            System.out.println("4 - Fazer a soma da diagonal secundaria");
            System.out.println("5 - imprimir a matriz");
            System.out.println("6 - Ver o menor valor da matriz");
            System.out.println("7 - Ver o maior valor da matriz");
            System.out.println("!=============================================================!");
            int op = ler.nextInt();
            if(op == 1){
                matriz.prencher(MatrizOriginal);
            }

            else if(op == 2){
                int resp = matriz.somageral(MatrizOriginal);
                System.out.println("o valor de sua soma é de " +resp);
            }
            else if (op == 3){
                int resp = matriz.somadp(MatrizOriginal);
                System.out.println("o valor de sua soma é de " +resp);
            }
            else if(op == 4){
                int resp = matriz.somads(MatrizOriginal);
                System.out.println("o valor de sua soma é de " +resp);
            }
            else if(op == 5){
                matriz.imprimir(MatrizOriginal);
            }
            else if (op == 6){
                matriz.menorM(MatrizOriginal);
            }
            else if (op == 7){
                matriz.MaiorM(MatrizOriginal);
            }
            System.out.println("DESEJA CONTINUAR?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int resp = ler.nextInt();

            if (resp == 2) {
                cont++;
            }
        }else{
            System.out.println("Por favor insira um valor para continuarmos");{
                x = ler.nextInt();
            }
        }
        }
        System.out.println("OBRIGADO POR UTILIZAR MEU PROGRAMA =D");

        ler.close();
    }
}
