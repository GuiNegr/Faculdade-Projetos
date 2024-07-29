import java.util.*;

public class Main {
    static String[][] tabuleiro = new String[3][3];
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        montarTabuleiro();
        exibir();
        loop();
        System.out.println("BY GuiNegreiros");


    }

    public static void loop() {
        boolean continuar = true;

        do {
            jogada();
            jogadaBot();
            if (check()){
                System.out.println("PARABENS VOCÊ GANHOU DA CASA!!!!");
                continuar = false;
            }
            if (checkBot()){
                System.out.println("VIXI PERDEU PRO BOT RUIM DEMAISE");
                continuar = false;
            }
            if(checkVelha()){
                System.out.println("VIXI DEU VELHA EIN");
                continuar = false;
            }
        } while (continuar);

    }
    public static boolean checkVelha() {
        int preenchido = 0;
      for(int i = 0; i < tabuleiro.length; i++){
          for(int j = 0 ; j < tabuleiro.length; j++){
              if(tabuleiro[i][j] != " # "){
                  preenchido++;
              }
          }
      }
      if(preenchido == 9){
          return true;
      }
      return false;
    }


    public static boolean check() {
        if        ((tabuleiro[0][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][2].equals(" X "))
                || (tabuleiro[0][0].equals(" X ") && tabuleiro[1][0].equals(" X ") && tabuleiro[2][0].equals(" X "))
                || (tabuleiro[0][1].equals(" X ") && tabuleiro[0][0].equals(" X ") && tabuleiro[0][2].equals(" X "))
                || (tabuleiro[1][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[1][2].equals(" X "))
                || (tabuleiro[2][0].equals(" X ") && tabuleiro[2][1].equals(" X ") && tabuleiro[2][2].equals(" X "))
                || (tabuleiro[0][2].equals(" X ") && tabuleiro[1][2].equals(" X ") && tabuleiro[2][2].equals(" X "))
                || (tabuleiro[0][1].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][1].equals(" X "))
                || (tabuleiro[0][2].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][0].equals(" X "))
        ) {
            return true;
        }
        return false;
    }


    public static boolean checkBot() {
        if        ((tabuleiro[0][0].equals(" 0 ") && tabuleiro[1][1].equals(" 0 ") && tabuleiro[2][2].equals(" 0 "))
                || (tabuleiro[0][0].equals(" 0 ") && tabuleiro[1][0].equals(" 0 ") && tabuleiro[2][0].equals(" 0 "))
                || (tabuleiro[0][1].equals(" 0 ") && tabuleiro[0][0].equals(" 0 ") && tabuleiro[0][2].equals(" 0 "))
                || (tabuleiro[1][0].equals(" 0 ") && tabuleiro[1][1].equals(" 0 ") && tabuleiro[1][2].equals(" 0 "))
                || (tabuleiro[2][0].equals(" 0 ") && tabuleiro[2][1].equals(" 0 ") && tabuleiro[2][2].equals(" 0 "))
                || (tabuleiro[0][2].equals(" 0 ") && tabuleiro[1][2].equals(" 0 ") && tabuleiro[2][2].equals(" 0 "))
                || (tabuleiro[0][1].equals(" 0 ") && tabuleiro[1][1].equals(" 0 ") && tabuleiro[2][1].equals(" 0 "))
                || (tabuleiro[0][2].equals(" 0 ") && tabuleiro[1][1].equals(" 0 ") && tabuleiro[2][0].equals(" 0 "))
        ) {
            return true;
        }
        return false;
    }

    public static void jogada() {
        System.out.println("INFORME A POSIÇÃO PARA JOGAR EX: 0 E 1");
        String resp = scn.nextLine();
        int[] a = respToInt(resp);
        int b = a[0];
        int x = a[1];
        if (tabuleiro[b][x].equals(" # ")) {
            tabuleiro[b][x] = " X ";
            exibir();
            System.out.println();
        }
    }

    public static void jogadaBot() {
        Random rand = new Random();
        boolean continuar = true;
        do {
            int a = rand.nextInt(2);
            int b = rand.nextInt(2);
            if (tabuleiro[a][b].equals(" # ")) {
                tabuleiro[a][b] = " 0 ";
                System.out.println();
                continuar = false;
            }
        } while (continuar);
        exibir();
    }


    public static int[] respToInt(String resp) {
        int[] respToInt = new int[2];
        int breakPointer = 0;
        for (int i = 0; i < resp.length(); i++) {

            try {
                int resp1 = Integer.parseInt(String.valueOf(resp.charAt(i)));

                if (resp1 == 1 || resp1 == 0 || resp1 == 2) {
                    respToInt[breakPointer] = resp1;
                    breakPointer++;
                }
                if (breakPointer == 2) {
                    break;
                }
            } catch (Exception e) {
                //Só para utilizar o try Catch
            }

        }
        return respToInt;
    }


    public static void exibir() {
        System.out.print("    0 ");
        System.out.print(" 1 ");
        System.out.print(" 2");
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            System.out.print("[");
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void montarTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = " # ";
            }
        }
    }
}