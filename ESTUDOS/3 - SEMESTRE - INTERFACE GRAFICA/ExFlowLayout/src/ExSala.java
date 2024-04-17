import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ExSala extends JFrame implements ListSelectionListener, ItemListener, ActionListener {
    JButton bt1, bt2, bt3, bt4, bt5, bt6;
    JPanel jp1 , jp2;

    public ExSala(){
        setTitle("PAINEIS E BOTAO");
        setSize(510,510);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(255,255,255));
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);


        jp1 = CriarPainel(0,0,500,250,2,2);
        bt1 = criarbotao("Gravar");
        bt2 = criarbotao("Alterar");
        bt3 = criarbotao("Excluir");
        bt4 = criarbotao("Vizualiar");
        jp1.add(bt1);
        jp1.add(bt2);
        jp1.add(bt3);
        jp1.add(bt4);
        jp2 = CriarPainel(0,jp1.getHeight(),500,210,2,1);
        bt5 = criarbotao("SAIR");
        bt6 = criarbotao("GRAVAR");
        jp2.add(bt5);
        jp2.add(bt6);

        getContentPane().add(jp1);
        getContentPane().add(jp2);
        setVisible(true);
    }

    public JButton criarbotao(String texto){
        JButton jb = new JButton();
        jb.setText(texto);
        jb.setBackground(new Color(3, 3, 3));
        jb.setForeground(new Color(255, 255, 255));
        jb.setFont(new Font("Helvetica", Font.BOLD, 12));
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.setVerticalAlignment(SwingConstants.CENTER);
        jb.setMnemonic(texto.charAt(0));
        return jb;
    }
    public JPanel CriarPainel(int x, int y, int width, int height, int rows , int cols){
        JPanel j1 = new JPanel();
        j1.setLayout(new GridLayout(rows,cols));
        j1.setBounds(x,y,width,height);
        j1.setBackground(Color.BLUE);
        return j1;
    }

    public static void main(String[] args) {
        new ExSala();
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
