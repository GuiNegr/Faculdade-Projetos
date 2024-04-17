import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario extends JFrame implements ListSelectionListener, ItemListener, ActionListener{

        JButton ok, cancel;
        JLabel nome,endereço,telefone,cpf,rg;
        JTextField nometxt, endereçoTxt, telefoneTxt, cpfTxt, rgTxt;
    public Formulario(){
        setTitle("LOGIN PAGE");
        setSize(680,420);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(145, 32, 241));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nome = criarLabel(" NOME: " , 50,50);
        add(nome);
        nometxt = criarTxt(50,50);
        add(nometxt);

        endereço = criarLabel(" ENDEREÇO: ",50,50);
        add(endereço);
        endereçoTxt = criarTxt(50,50);
        add(endereçoTxt);

        telefone = criarLabel(" Telefone: ",50,50);
        add(telefone);
        telefoneTxt = criarTxt(50,50);
        add(telefoneTxt);

        cpf  = criarLabel(" CPF: ",50,50);
        add(cpf);
        cpfTxt = criarTxt(50,50);
        add(cpfTxt);

        rg = criarLabel(" RG: ",50,50);
        add(rg);
        rgTxt = criarTxt(50,50);
        add(rgTxt);

        ok = criarBotao("OK");
        add(ok);
        cancel = criarBotao("CANCELAR");
        add(cancel);
        getContentPane().setLayout(new GridLayout(6,2));
        setVisible(true);

    }


    public JButton criarBotao(String text){
        JButton jb = new JButton();
        jb.setText(text);
        jb.setSize(50,50);
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
        return jl;
    }
    public JTextField criarTxt(int heigth, int width){
        JTextField jt = new JTextField();
        jt.setForeground(new Color(80, 33, 133));
        jt.setFont(new Font("Impact ", Font.BOLD, 22));
        add(jt);
        return jt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            if(nometxt.getText().isEmpty() ||rgTxt.getText().isEmpty() || endereçoTxt.getText().isEmpty() ||  telefoneTxt.getText().isEmpty() || cpf.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "POR FAVOR PREENCHA TODOS OS CAMPOS");
            }
            else{
                JOptionPane.showMessageDialog(null, "CADASTRO COM SUCESSO");
            }
        }
        if(e.getSource() == cancel){
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
}
