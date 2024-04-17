import java.awt.*;
import javax.swing.*;
public class TstBorderLayout extends JFrame {
    private JButton bt1,bt2,bt3,bt4,bt5, bt6;
    public TstBorderLayout(){
        setTitle("TESTE DE BORDA");
        setSize(350,150);
        Container c = getContentPane();
        c.setBackground(new Color(255,255,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        BorderLayout bl = new BorderLayout(6,6);
        c.setLayout(bl);
         bt1 = criarBotao("Botao norte", BorderLayout.NORTH);
         bt2 = criarBotao("Botao sul", BorderLayout.SOUTH);
         bt6 = criarBotao("Botao sul", BorderLayout.SOUTH);
         bt3 = criarBotao("Botao leste", BorderLayout.EAST);
         bt4 = criarBotao("Botao oeste", BorderLayout.WEST);
         bt5 = criarBotao("Botao centro", BorderLayout.CENTER);
        setVisible(true);
    }
    private JButton criarBotao(String texto, String posicao){
        JButton b1 = new JButton(texto);
        add(b1, posicao);
        b1.setMnemonic(texto.charAt(6));
        return b1;
    }

    public static void main(String[] args) {
        new TstBorderLayout();
    }
}
