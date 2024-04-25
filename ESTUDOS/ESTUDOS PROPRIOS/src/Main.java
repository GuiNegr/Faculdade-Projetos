
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //aqui ja vou utilizar a bibloteca


        //primeiro e o tipo da chave e o a esquerda valor, precisa declarar sempre o tipo de chave e valor
        HashMap<Integer, String> carros = new HashMap<Integer,String>();

        //sei q ta errado o nomekk
        carros.put(1, "volksavagem");
        //carros.put(2, "selta"); porque sem esse funciona
        carros.put(3, "korsa");
        carros.put(4, "monza");
        carros.put(5, "fordifoquice");
        carros.put(6, "atak");
        carros.put(90, "viatura");// porem esse não?

        System.out.println(carros);
        for (int i = 0 ; i < carros.size(); i++){
            if (carros.get(i) != null){
                System.out.println("VALOR = "+i+ "CHAVE = "+ carros.get(i));
            }
        }

        carros.remove(5);
    }
}