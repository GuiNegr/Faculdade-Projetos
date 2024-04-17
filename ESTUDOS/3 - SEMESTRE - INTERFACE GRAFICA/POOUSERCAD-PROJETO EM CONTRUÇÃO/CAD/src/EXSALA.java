import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EXSALA  extends JFrame implements ListSelectionListener, ItemListener, ActionListener{
    JButton sair, Ok;
    JLabel User, Password;
    JTextField userText;
    JPasswordField userPass;

    public EXSALA(){
        setTitle("LOGIN PAGE");
        setSize(680,420);
        getContentPane().setBackground(new Color(145, 32, 241));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        User = criarLabel(" Usuario:", 50,50);
        add(User);
        userText = criarTxt(50,50);
        add(userText);
        Password = criarLabel(" Senha:", 50, 50);
        add(Password);
        userPass = criarsenha(50,50);
        add(userPass);
        sair = criarBotao("Sair");
        Ok = criarBotao("Ok");
        add(Ok);
        add(sair);
        getContentPane().setLayout(new GridLayout(3,2));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Ok){
            if(userText.getText().equals("Guilherme") && userPass.getText().equals("1234")){
                JOptionPane.showMessageDialog(null, "BEM VINDO GUILHERME ");
                new Formulario();
            }
            else {
                JOptionPane.showMessageDialog(null, "SAI FORA MLK");
            }
        }
        if(e.getSource() == sair){
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                System.exit(0);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
    public JButton criarBotao(String text){
        JButton jb = new JButton();
        jb.setText(text);
        jb.setBackground(new Color(3,3,3));
        jb.setForeground(new Color(255,255,255));
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.setVerticalAlignment(SwingConstants.CENTER);
        jb.setMnemonic(text.charAt(0));
        jb.addActionListener(this);
        add(jb);
        return jb;
    }
    public JLabel criarLabel(String text, int heigth , int width){
        JLabel jl = new JLabel();
        jl.setText(text);
        jl.setSize(width,heigth);
        jl.setForeground(new Color(255,255,255));
        jl.setFont(new Font("Impact", Font.ITALIC , 28));
        add(jl);
        return jl;
    }
    public JTextField criarTxt(int heigth, int width){
        JTextField jt = new JTextField();
        jt.setForeground(new Color(80, 33, 133));
        jt.setFont(new Font("Impact ", Font.BOLD, 22));
        add(jt);
        return jt;
    }

    public JPasswordField criarsenha(int heigth, int width){
        JPasswordField jpw = new JPasswordField();
        jpw.setForeground(new Color(80, 33, 133));
        jpw.setFont(new Font("Impact ", Font.BOLD, 22));
        add(jpw);
        return jpw;
    }

    public static void main(String[] args) {
        new EXSALA();
    }
}
