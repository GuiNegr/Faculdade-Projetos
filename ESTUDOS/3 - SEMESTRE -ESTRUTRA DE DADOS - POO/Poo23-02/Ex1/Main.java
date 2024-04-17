package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login novo = new Login();

        Scanner ler = new Scanner(System.in);

        System.out.println("BEM VINDO AO GUILHERME SYSTEM");
        System.out.println("===========================");

        boolean validou = false;
    do{
        System.out.println("INFORME SEU LOGIN");
        String login = ler.nextLine();
        novo.setLogin(login);
            
        System.out.println("INFORME SUA SENHA");
        String senha = ler.nextLine();
        novo.setSenha(senha);
            
        if(novo.exibição()){
        validou = true;
        }
    }while(!validou);
        System.out.println("SEJA BEM VINDO MARCOS! FICO FELIZ QUE VOCE ESTEJE AQUI");
        ler.close();
        }
    }
