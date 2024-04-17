package Exemplo02;

public class Carro {
    public static String placa = "ABD-1563";

    // se voce cria uma variavel static quando voce sabe que o tipo de informaçao
    // dada pelo usuario nao vai ser infinita, quando for algo já predefinido que
    // tem um uso limitado
    // voce aplica o static
    // exemplo nessa classe: numero de portas, numero de rodas etc
    public static void main(String []args) {
        Carro carro1 = new Carro();
        // Carro carro2 = new Carro();

        System.out.println("Carro.placa: " + Carro.placa);
        // System.out.println("Carro1.placa: "+carro1.placa);
        // System.out.println("Carro2.placa: "+carro2.placa);

        System.out.println("Aleterando a placa do carro 1");
        carro1.placa = "DBX-4034"; //
        // System.out.println("carro1.placa: "+carro1.placa);
        // System.out.println("Carro2.placa: "+carro2.placa);
        System.out.println("Carro.placa: " + Carro.placa);

    }
}
