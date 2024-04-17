import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O TAMANHO DO SEU ARRAY? "));
        String[] array = new String[tam];

        String valores[] = {"caminhão ", "busao", "carro"};
        Object escolha = null;

        for (int i = 0; i < tam; i++) {
            escolha = JOptionPane.showInputDialog(null, "qual veiculo quer escolher?", "CADASTRO", JOptionPane.WARNING_MESSAGE, null, valores, valores[0]);
            Veiculo veiculo = null;
            if (escolha.equals("caminhão ")) {
                String placa = JOptionPane.showInputDialog("QUAL É A PLACA?");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O ANO?"));
                int peso = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O PESO DA CARGA?"));
                veiculo = new Caminhao(placa, ano, peso);
                array[i] = veiculo.MostrarDados();
            } else if (escolha.equals("busao")) {
                String placa = JOptionPane.showInputDialog("QUAL É A PLACA?");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O ANO?"));
                int passageiro = Integer.parseInt(JOptionPane.showInputDialog("QUAL É A QUANTIDADE DE PASSAGEIROS?"));
                veiculo = new Onibus(placa, ano, passageiro);
                array[i] = veiculo.MostrarDados();
            } else if (escolha.equals("carro")) {
                String placa = JOptionPane.showInputDialog("QUAL É A PLACA?");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O ANO?"));
                veiculo = new Veiculo(placa, ano);
                array[i] = veiculo.MostrarDados();
            }
        }
        for (String item : array) {
            System.out.println(item);
        }
    }
}