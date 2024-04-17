import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExFlow extends JFrame{
    private JButton btn1,btn2,bt3,bt4,btn5;
    private Container c; //criação do objeto tipo container
    public ExFlow(){
        super("EXEMPLO DE FLUXO");

        c = getContentPane();

        setLayout(new FlowLayout());
        btn1 = criarBotao("Botão 1", '1');
        btn2 = criarBotao("Botão 2", '2');
        bt3 = criarBotao("Botão 3", '3');
        bt4 = criarBotao("Botão 4", '4');
        btn5 = criarBotao("Botão 5", '5');
        c.add(btn1);
        c.add(btn2);
        c.add(bt3);
        c.add(bt3);
        c.add(bt4);
        c.add(btn5);

        setSize(350,120);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static JButton criarBotao(String texto, char c){
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(0,0,170));
        botao.setForeground(Color.YELLOW);
        botao.setFont(new Font("Helvetica",Font.BOLD,14));
        botao.setToolTipText("Botao de comando");
        botao.setHorizontalAlignment(SwingConstants.CENTER);
        botao.setVerticalAlignment(SwingConstants.CENTER);
        botao.setMnemonic(c);
        return botao;
    }
    public static void main(String[] args) {
        new ExFlow();
    }

}