import javax.swing.*;
public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {

    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String MostrarDados() {
       String str = "=====Veiculo ===== \n PLACA: " + placa + "\n" + " ANO: " + ano;
       return str;
    }

}