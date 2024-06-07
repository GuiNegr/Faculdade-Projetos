import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Consultor extends JFrame implements ActionListener {

    private JButton button;
    public JLabel label;
    private FileInputStream fis;


    private Connection con = new Conecta().conecta();
    private PreparedStatement pst;

    private int tamanho;

    public Consultor(){
        setSize(680,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button = new JButton("Carregar foto");
        add(button);
        button.addActionListener(e -> {
            Foto a = pegador();
            adicionar(a);
        });
        label = la();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(button, BorderLayout.SOUTH);
        panel.add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }


    //label para segurar a imagen
    public  JLabel la(){
        JLabel label1 = new JLabel();
        URL iconURL = getClass().getResource("C:\\Users\\Gui\\Desktop\\procurar.png");
        label1.setSize(515,515);
        add(label1);
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            label1.setIcon(icon);
            return label1;
        } else {
            return label1;
        }
    }

    //metodo para fazer um explorador de arquivos conseguir pegar uma imagen
    public Foto pegador(){
        JFileChooser pegador = new JFileChooser(); // Cria o objeto responsavel pelo gerenciador de arquvios
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG & JPEG Images","jpg","png","jpeg");
        // faz um filtro para utilizar e deixar pegar somente as extençoes premeditadas
        pegador.setFileFilter(filter);
        // adiciona o filtro
        int returnVal = pegador.showOpenDialog(this);
        // aqui retorna um numero para conseguir aprovar no proximo if
        Foto a = null;
        if(returnVal == JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(null, "e mano funcionou" +pegador.getSelectedFile().getName());
            try { // precisa do try catch pq gera uma exceção de erro
                //conseguir pegar o arquivo do seletor
                File selectedFile = pegador.getSelectedFile();
                fis = new FileInputStream(selectedFile);
                //ver o tamanho em byte
                tamanho = (int) selectedFile.length();
                //trasncreve o byte para int
                Image foto = ImageIO.read(selectedFile).getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                // aqui consegue interpretar a imagem com a juda do Io e troca o tamanho para se adequar o label
                // troca o icon
                 a = new Foto(fis,tamanho);
                label.setIcon(new ImageIcon(foto));
                return  a;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return  a;
    }


    private void adicionar(Foto foto){
        String insert = "INSERT INTO TESTE (FOTO) VALUES (?)";
        try {
            pst = con.prepareStatement(insert);
            //fis e o objeto responsavel pela captura do arquivo
            //tamanho e responsavel por armazenar o tamanho em bytes
            pst.setBlob(1,foto.getFis(),foto.getTamanho());
            pst.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
