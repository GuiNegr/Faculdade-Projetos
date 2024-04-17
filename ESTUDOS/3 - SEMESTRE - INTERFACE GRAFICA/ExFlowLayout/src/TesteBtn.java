import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TesteBtn  extends  JFrame implements  ListSelectionListener , ItemListener,ActionListener{
    JButton b1, b2;
    JPanel botao;

    public TesteBtn(){
        setTitle("Evento");

        b1 = criarbotao("Gravar");
        b2 = criarbotao("Sair");

        botao = new JPanel();

    }

    public JButton criarbotao(String texto){
        JButton jb = new JButton();
        jb.setText(texto);
        jb.setBackground(new Color(3,3,3));
        jb.setForeground(new Color(255,255,255));
        jb.setFont(new Font("Helvetica", Font.BOLD, 12));
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.setVerticalAlignment(SwingConstants.CENTER);
        jb.setMnemonic(texto.charAt(0));
        return jb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
