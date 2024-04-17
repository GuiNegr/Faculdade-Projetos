package Ex2;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Main {
    public static void main(String[] args) {
        Poo object = new Poo();
        Scanner ler = new Scanner(System.in);
        boolean validou = false;
        String resp = " ";
        int op = ler.nextInt();
        System.out.println("ESCOLHA UM CASO");
        System.out.println("1 - vai ler seu nome e escolher quantos char separar");
        System.out.println("2 - vai receber um nome e imprimir os char das pos impar");
        System.out.println("3 - so retorna varias vezes o nome pela quantidade de letras");
        System.out.println("4 -vai ler um nome e retornar a quantidade de letras ");
        System.out.println("5 -vai ler uns dados e vai so voltar o aceito caso tenha o poo ");
        System.out.println();
        do {
            switch (op) {
                case 1:
                System.out.println("informe um nome");
                resp = ler.nextLine();
                object.setNome(resp);
                System.out.println("Informe até onde ler");
                int pos = ler.nextInt();
                object.setPos(pos);
                object.Pos();
                System.out.println("QUER REALIZAR UMA NOVA TAREFA?");
                String resptarefa = ler.next();
                if(resptarefa.equals("nao")){
                    System.out.println("Obrigado par utilizar o nosso programa")
                    validou = true;
                }
                else if(resptarefa.equals('"sim')){
                    validou = false;
                }
                    break;
                case 2:
                    System.out.println("Informe um nome para ver os char na posição impar");
                    resp = ler.next();
                    object.setNome(resp);
                    String respimpar = object.imparpos();
                    System.out.println(respimpar);
                    System.out.println("QUER REALIZAR UMA NOVA TAREFA?");
                    String resptarefa = ler.next();
                    if(resptarefa.equals("nao")){
                        System.out.println("Obrigado par utilizar o nosso programa")
                        validou = true;
                    }
                    else if(resptarefa.equals('"sim')){
                        validou = false;
                    }
                    break;
                case 3:
                    System.out.println("informe Nesta ordem:NOME, IDADE, SEXO ");
                    resp = ler.next();
                    object.setNome(resp);
                    int idade = ler.nextInt();
                    object.setIdade(idade);
                    resp = ler.next();
                    object.setSexo(resp);
                    if(object.aceitacao()){
                        System.out.println("ACEITO");
                        
                    }else{
                        System.out.println("Não aceito");
                    } 
                    System.out.println("QUER REALIZAR UMA NOVA TAREFA?");
                    String resptarefa = ler.next();
                    if(resptarefa.equals("nao")){
                        System.out.println("Obrigado par utilizar o nosso programa")
                        validou = true;
                    }
                    else if(resptarefa.equals('"sim')){
                        validou = false;
                    }
                    break;
                case 4:
                    System.out.println("Informe um nome");
                    resp = ler.next();
                    object.setNome(resp);
                    int cont = object.cont();
                    System.out.println("SEU NOME TEM "+cont+ "letras");
                    System.out.println("QUER REALIZAR UMA NOVA TAREFA?");
                    String resptarefa = ler.next();
                    if(resptarefa.equals("nao")){
                        System.out.println("Obrigado par utilizar o nosso programa")
                        validou = true;
                    }
                    else if(resptarefa.equals('"sim')){
                        validou = false;
                    }
                    break;

                case 5:
                    System.out.println("Informe um nome");
                    resp = ler.next();
                    object.setNome(resp);
                    object.Stringreturn();
                    System.out.println("QUER REALIZAR UMA NOVA TAREFA?");
                    String resptarefa = ler.next();
                    if(resptarefa.equals("nao")){
                        System.out.println("Obrigado par utilizar o nosso programa")
                        validou = true;
                    }
                    else if(resptarefa.equals('"sim')){
                        validou = false;
                    }
                break;
                case 6:
                    System.out.println("Informe uma frase");
                    String frase = ler.next();
                    object.setFrase(frase);
                break;
            }
        } while (!validou);
    }
}
