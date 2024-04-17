import java.util.Scanner;
public class EX08ad07 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("MAQUINA DE RETANGULOS:");
        System.out.println();
        System.out.println("INFORME UM NUMERO:");
        int num = ler.nextInt();
        
        System.out.println("INFORME OUTRO NUMERO:");
        int num2 = ler.nextInt();
        retangulo(num, num2);
        }public static void retangulo(int num, int num2){
            int cont2 = 1;
            while(num >= cont2){
            int cont = 1;
            while(num2 >= cont){
                System.out.print("* ");
                cont++;
            }
            System.out.println();
            cont2++;
        }
        }
    }