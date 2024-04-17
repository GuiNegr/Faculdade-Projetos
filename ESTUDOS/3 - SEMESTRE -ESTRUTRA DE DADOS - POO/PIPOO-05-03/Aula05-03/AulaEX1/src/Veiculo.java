import javax.swing.JOptionPane;
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

    public void MostrarDados() {
        System.out.println("PLACA: " + placa + "\n" + "ANO: " + ano);
    }

    public static void main(String[] args) {
        int resp = 0;
        do {
            String valores[] = {"caminhão ", "busao"};
            Object escolha = null;
            while (escolha == null) {
                escolha = JOptionPane.showInputDialog(null, "qual veiculo quer escolher?", "CADASTRO", JOptionPane.WARNING_MESSAGE, null, valores, valores[0]);
            }
            Veiculo veiculo = null;
            if (escolha.equals("caminhão")) {
                String placa = JOptionPane.showInputDialog("QUAL É A PLACA?");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O ANO?"));
                int peso = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O PESO DA CARGA?"));
                veiculo = new Caminhao(placa, ano, peso);
            } else if (escolha.equals("busao")) {
                String placa = JOptionPane.showInputDialog("QUAL É A PLACA?");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O ANO?"));
                int passageiro = Integer.parseInt(JOptionPane.showInputDialog("QUAL É A QUANTIDADE DE PASSAGEIROS?"));
                veiculo = new Onibus(placa, ano, passageiro);
            }
            veiculo.MostrarDados();
            resp = JOptionPane.showConfirmDialog(null,
                    "Cadastrar outro?");
        } while (resp == 0);
    }
}