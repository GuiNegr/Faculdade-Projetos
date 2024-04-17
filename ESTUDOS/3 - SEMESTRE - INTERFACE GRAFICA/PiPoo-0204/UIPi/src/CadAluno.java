import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CadAluno extends JFrame implements ListSelectionListener, ItemListener, ActionListener {

    JButton b1, b2;
    JList list, listmort;
    DefaultListModel listModel, listmort1;

    public CadAluno() {
        setTitle("CADASTRAR ALUNOS");
        setSize(1280, 720);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(145, 32, 241));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        criarJLabel("CPF: ", 70, 40);
        criarCaixaTexto(120, 20, 60, 23);
        criarJLabel("RG: ", 70, 40);
        criarCaixaTexto(120, 20, 260, 23);

        criarJLabel("NOME: ", 90, 50);
        criarCaixaTexto(450, 20, 67, 85);

        criarJLabel("LOGRADOURO: ", 120, 50);
        criarCaixaTexto(100, 20, 130, 157);
        criarJLabel("ENDEREÇO: ", 120, 50);
        criarCaixaTexto(370, 20, 340, 157);

        listModel = new DefaultListModel();
        criarJLabel("SEXO: ", 120, 50);
        listModel.addElement("Feminino");
        listModel.addElement("Masculino");
        list = new JList(listModel);
        JScrollPane Painel = new JScrollPane(list);

        criarJLabel("FALECIDO: ", 120, 50);
        listmort1 = new DefaultListModel();
        listmort1.addElement("SIM");
        listmort1.addElement("NAO");
        listmort = new JList(listmort1);
        JScrollPane Painel2 = new JScrollPane(listmort);

        setLayout(new GridLayout(9, 1));

        add(Painel);
        add(Painel2);

        b1 = Butao("GRAVAR");
        b1.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "GRAVAÇÃO COM SUCESSO");
        });
        b2 = Butao("SAIR");
        b2.addActionListener(e -> {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        add(b1);
        add(b2);

        setLocationRelativeTo(null);
        setVisible(true);
        centralizar();
    }

    public JTextField criarCaixaTexto(int larg, int alt, int distEsq, int distTopo) {
        JTextField jt = new JTextField();
        jt.setLocation(distEsq, distTopo);
        jt.setSize(larg, alt);
        jt.setForeground(new Color(80, 33, 133));
        jt.setFont(new Font("Impact ", Font.BOLD, 18));
        add(jt);
        return jt;
    }

    public JLabel criarJLabel(String texto, int larg, int alt) {
        JLabel jl = new JLabel();
        jl.setText(texto);
        jl.setSize(larg, alt);
        jl.setForeground(new Color(255, 255, 255));
        jl.setFont(new Font("Impact", Font.ITALIC, 18));
        add(jl);
        return jl;
    }

    public JButton Butao(String a) {
        JButton jb = new JButton();
        jb.setText(a);
        jb.setBackground(new Color(3, 3, 3));
        jb.setForeground(new Color(255, 255, 255));
        jb.setFont(new Font("Helvetica", Font.BOLD, 12));
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.setVerticalAlignment(SwingConstants.CENTER);
        jb.setMnemonic(a.charAt(0));
        return jb;
    }

    public static void main(String[] args) {
        new CadAluno();

    }

    public void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "GRAVAÇÃO COM SUCESSO");
        }
        if (e.getSource() == b2) {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
