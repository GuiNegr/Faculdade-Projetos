package EX3;
import java.util.Scanner;
public class TesteCirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Circulo NovoCirc = new Circulo();
        double circulo = 0;
        int cont = 0;
       
        while (cont <= 0){
        System.out.println("Informe o tamanho do raio");
        circulo = ler.nextDouble();
            if(NovoCirc.pos(circulo) == true){
                cont = 3;
            }
            else{}
        }

        NovoCirc.imprimir(circulo);

        ler.close();
    }
}
