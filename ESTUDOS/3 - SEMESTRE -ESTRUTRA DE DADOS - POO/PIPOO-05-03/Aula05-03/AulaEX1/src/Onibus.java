public class Onibus extends Veiculo{
    private int passageiros;
    public Onibus(String placa, int ano, int passageiros){
        super(placa,ano);
        this.passageiros = passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    @Override
    public void MostrarDados() {
        System.out.println("PLACA: "+super.getPlaca()+" \n ANO: "+super.getAno() + " \n QTD PASSAGEIROS: "+passageiros);
    }
}
