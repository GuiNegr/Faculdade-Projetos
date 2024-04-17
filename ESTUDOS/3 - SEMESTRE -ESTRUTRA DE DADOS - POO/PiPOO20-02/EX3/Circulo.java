package EX3;
public class Circulo {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public void imprimir(double raio){
        System.out.println("O RAIO DO CIRCULO É "+raio);
    }
    public boolean pos(double raio){
        boolean a = false;
        if(raio < 0){
            a = false;
        }
        else if( raio > 0){
            a = true;
        }
        return a;
    }
}
