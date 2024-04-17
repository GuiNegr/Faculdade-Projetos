// https://dontpad.com/abril02

//Exemplo PLACEHOLDER
//Fonte: https://stackoverflow.com/questions/16213836/java-swing-jtextfield-set-placeholder?newreg=b1d163b81bd34780b7fbeca8ea0cf58f


import java.awt.*;
import javax.swing.*;
public class PrimeiroExemplo extends JFrame{
    public PrimeiroExemplo(){
        setTitle("Primeira Janela Swing");//Titulo da janela
        setSize(800 , 600);//tamanho da janela
        getContentPane().setLayout(null);// anula o layout padrao
        getContentPane().setBackground(new Color(145, 32, 241));//cor de fundo da janela no padrão RGB (Red Green Blue)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//provoca o termino da execução (encerra o programa)
        int linha = 30;
        int distEsq = 10;
        int distTopo = 10;
        //1ª linha
        criarJLabel("Nome", 150, linha, distEsq , distTopo);//nome, larg, altura, distEsq, distTopo
        criarCaixaTexto(400, linha, distEsq+150 , distTopo);


        //2ª linha
        distEsq = 10;
        distTopo +=linha;
        criarJLabel("CPF", 150, linha, distEsq , distTopo);//nome, larg, altura, distEsq, distTopo
        criarCaixaTexto(400, linha, distEsq+150 , distTopo);
        Butao("Gravar",50,90,100,30);
        centralizar();
        setVisible(true);
    }
    public JTextField criarCaixaTexto(int larg, int alt, int distEsq, int distTopo) {
        JTextField jt = new JTextField();
        jt.setLocation(distEsq, distTopo);
        jt.setSize(larg, alt);
        jt.setForeground(new Color(80, 33, 133));
        jt.setFont(new Font("Courier new", Font.BOLD, 18));
        add(jt);
        return jt;
    }

    public static void main(String [] args){
        new PrimeiroExemplo();
    }
    public void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();//obtém a altura e largura da resolução vídeo
        Dimension janela = getSize();//obtém a altura e largura da minha JANELA
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width)/2,
                (screen.height - janela.height)/2);
    }
    public JLabel criarJLabel(String texto, int larg, int alt, int desq, int dtopo){
        JLabel jl = new JLabel();
        jl.setText(texto);
        jl.setLocation(desq, dtopo);
        jl.setSize(larg, alt);
		jl.setForeground(new Color(255, 255, 255));
        jl.setFont(new Font("Courier new", Font.BOLD, 18));
        add(jl);
        return jl;
    }

    public JButton Butao(String a , int desq, int dtopo, int larg , int alt){
        JButton jb = new JButton();
        jb.setText(a);
        jb.setBounds(desq,dtopo,larg,alt);
        jb.setBackground(new Color(3, 3, 3));
        jb.setForeground(new Color(255, 255, 255));
        jb.setFont(new Font("Helvetica", Font.BOLD, 12));
        jb.setToolTipText("Botao bl");
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.setVerticalAlignment(SwingConstants.CENTER);
        jb.setMnemonic(a.charAt(0));
        add(jb);
        return jb;
    }
}
