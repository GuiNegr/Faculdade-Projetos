package Ex2;
import java.util.Scanner;

public class Main {
    static Poo object = new Poo();
    static Scanner ler = new Scanner(System.in);
    static boolean validou = false;
    static String resp = " ";

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("=======================BEM VINDO=======================");
        System.out.println("====TREINO DE POO COM FUNÇÕES E METODOS EM STRINGS=====");
        System.out.println("===========================================================");
        System.out.println("ANTES DE COMEÇARMOS");
        System.out.println("informe uma palavra");
        resp = ler.nextLine();
        object.setNome(resp);

        do {
            System.out.println("ESCOLHA UM CASO");
            System.out.println("1 - Leitura de palavras, você decide até onde pode imprimir na tela sua palavra escolhida");
            System.out.println("2 - Leitura apenas das posições impares da sua palavras");
            System.out.println("3 - Credenciamento de checagem de usuario");
            System.out.println("4 - Contador de letras");
            System.out.println("5 - Repetir sua palavra pela quantidades de letras que há");
            System.out.println("6 - Contador de vogais");
            int op = ler.nextInt();

            switch (op) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    ex3();
                    break;
                case 4:
                    ex4();
                    break;
                case 5:
                    ex5();
                    break;
                case 6:
                    ex6();
                    break;
                default:
                    System.out.println("Eita parece que não há essa funçao :/");
                    break;
            }
            System.out.println("Gostaria de continuar utilizando o programa? (sim/não)");
            String continuar = ler.next();
            if (continuar.equalsIgnoreCase("não")) {
                validou = true;
            } 
        } while (!validou);

        System.out.println("OBRIGADO POR UTILIZAR, TENHA UM ÓTIMO DIA!");
        ler.close(); 
    }

    public static void ex1() {
        System.out.println("Informe até onde ler");
        int pos = ler.nextInt();
        object.setPos(pos);
        object.Pos();
    }

    public static void ex2() {
        object.setNome(resp);
        String respimpar = object.imparpos();
        System.out.println(respimpar);
    }

    public static void ex3() {
        System.out.println("informe Nesta ordem: NOME, IDADE, SEXO ");
        resp = ler.next();
        object.setNome(resp);
        int idade = ler.nextInt();
        object.setIdade(idade);
        resp = ler.next();
        object.setSexo(resp);
        if (object.aceitacao()) {
            System.out.println("ACEITO");
        } else {
            System.out.println("Não aceito");
        }
    }

    public static void ex4() {
        object.setNome(resp);
        int cont = object.cont();
        System.out.println("SEU NOME TEM " + cont + " letras");
    }

    public static void ex5() {
        object.setNome(resp);
        object.Stringreturn();
    }

    public static void ex6() {
        System.out.println("Informe uma frase");
        String frase = ler.next(); 
        object.setFrase(frase);
        int[] vogal = object.contadorvogal();
        System.out.println("ESSA FRASE CONTEM \n A: "+vogal[0]+"\n E: "+vogal[1]+"\n I: " +vogal[2]+ " \n O: "+vogal[3] + "\n U: "+vogal[4]);
}
}
