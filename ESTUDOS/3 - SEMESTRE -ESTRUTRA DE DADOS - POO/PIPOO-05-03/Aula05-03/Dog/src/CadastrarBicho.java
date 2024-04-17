import javax.swing.JOptionPane;
public class CadastrarBicho {
    public static void main(String[] args) {
        int resp=0;
        do {
            String valores[] = {"Bicho","Cachorro", "Gato"};
            Object escolha = null;
            while(escolha==null) {
                escolha = JOptionPane.showInputDialog(null,
                        "Qual tipo de Bicho deseja cadastrar?",
                        "Cadastro", JOptionPane.WARNING_MESSAGE,
                        null, valores, valores[0]);
            }
            Bicho bicho = null;
            if(escolha.equals("Bicho"))		{
                bicho = new Bicho();
            }
            else if(escolha.equals("Cachorro"))		{
                bicho =  new Cachorro();
            }
            else if(escolha.equals("Gato"))		{
                bicho = new Gato();
            }
            bicho.fala();
            resp = JOptionPane.showConfirmDialog(null,
                    "Cadastrar outro?");
        }while(resp==0);
    }
}