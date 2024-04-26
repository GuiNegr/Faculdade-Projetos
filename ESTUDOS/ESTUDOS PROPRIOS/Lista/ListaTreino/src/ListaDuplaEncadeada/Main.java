package ListaDuplaEncadeada;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaDupla<String> lsdp = new ListaDupla<>();
        lsdp.add(gerador());
        lsdp.add(gerador());
        lsdp.add(gerador());
        lsdp.add(gerador());
        lsdp.add(gerador());
        lsdp.add(gerador());
        System.out.println(lsdp);
    }
    public static String gerador(){
        Random rd = new Random();
        String[] nomes = {"Roberto", "marcos", "romario","denis","mario",
                "Josue","Maikon","Douglas","tio roberto","Akira", "Guilherme","barriguinha mole"
        };
        return nomes[rd.nextInt(12)];
    }
}
