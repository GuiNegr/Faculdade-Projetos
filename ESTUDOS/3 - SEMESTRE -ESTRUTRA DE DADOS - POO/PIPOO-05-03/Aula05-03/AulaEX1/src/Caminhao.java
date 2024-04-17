public class Caminhao extends Veiculo{
    private  int pesoCarga;

    public Caminhao(String placa, int ano, int pesoCarga){
        super(placa,ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void MostrarDados() {
        System.out.println("PLACA: "+super.getPlaca()+" \n ANO: "+super.getAno() + " \n PESO DA CARGA: "+pesoCarga);
    }
}
