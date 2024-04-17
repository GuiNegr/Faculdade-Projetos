import java.awt.*;
import javax.swing.*;
public class TeseGridLayout extends JFrame{
    public TeseGridLayout(){
        setTitle("Teste GridLayout");
        setSize(300,150);
        getContentPane().setBackground(new Color(180,189,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout gl = new GridLayout(3,2,0,0);
        getContentPane().setLayout(gl);
        JButton b1 = criarBotao("linha 1 - colua 1");
        JButton b2 = criarBotao("linha 1 - colua 2");
        JButton b3 = criarBotao("linha 2 - colua 1");
        JButton b4 = criarBotao("linha 2 - colua 2");
        JButton b5 = criarBotao("linha 3 - colua 1");
        JButton b6 = criarBotao("linha 3 - colua 2");
        setVisible(true);
    }
    private JButton criarBotao(String texto){
        JButton botao = new JButton(texto);
        add(botao);
        return botao;
    }

    public static void main(String[] args) {
        new TeseGridLayout();
    }
}
