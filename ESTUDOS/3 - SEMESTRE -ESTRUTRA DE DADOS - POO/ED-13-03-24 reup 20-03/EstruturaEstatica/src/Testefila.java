import java.util.Random;
public class Testefila {
    public static void main(String[] args) {
        Random rand = new Random();
        Fila<Integer> fila = new Fila<Integer>();

        System.out.println("A FILA ESTÁ VAZIA? :"+fila.estaVazia());
        System.out.println("QUAL O TAMANHO DA FILA: "+fila.tamanho());
        if(fila.espiar() == null){
            System.out.println("a fila está vazia");
        }else {
            System.out.println(fila.espiar());
        }


        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("A FILA ESTÁ VAZIA? :"+fila.estaVazia());
        System.out.println("QUAL O TAMANHO DA FILA: "+fila.tamanho());

        System.out.println(fila.toString());

        for(int i = 0; i < 20; i++){
            fila.enfileira(rand.nextInt(20));
        }
        System.out.println("QUAL O TAMANHO DA FILA: "+fila.tamanho());
        System.out.println(fila.toString());
        System.out.println(fila.espiar());

        for(int i = 0; i < 23; i++){
            System.out.println(fila.desenfileira());
            System.out.println(fila.toString());
        }
    }
}
