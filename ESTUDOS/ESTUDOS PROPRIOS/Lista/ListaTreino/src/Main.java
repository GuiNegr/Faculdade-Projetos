import java.util.Random;

public class Main {
    //ESTUDO GUIADO PELO LIVRO ESTRUTRUAS DE DADOS E ALGORTIMOS POR GOODRICH TAMASSIA :D
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListaEcandeada<String> listaencadeada = new ListaEcandeada<>();
        listaencadeada.add(gerador());
        listaencadeada.add(gerador());
        listaencadeada.add(gerador());
        listaencadeada.add(gerador());
        listaencadeada.add(gerador());
        listaencadeada.add(gerador());
        System.out.println(listaencadeada);
        listaencadeada.removeinicio();
        listaencadeada.removeinicio();
        System.out.println();
        System.out.println(listaencadeada);
        listaencadeada.removeultimo();
        System.out.println(listaencadeada);
    }

    public static String gerador(){
        Random rd = new Random();
        String[] nomes = {"Roberto", "marcos", "romario","denis","mario",
        "Josue","Maikon","Douglas","tio roberto","Akira", "Guilherme","barriguinha mole"
        };
        return nomes[rd.nextInt(12)];
    }
}