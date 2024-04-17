import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class ExCheck extends JFrame {
    JCheckBox c1,c2,c3,c4;
   public ExCheck(){
       setBackground(new Color(180,180,180));
       setTitle("que time é teu?");
       setSize(400,150);
       setLayout(new FlowLayout(FlowLayout.CENTER));
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);


       JPanel check = new JPanel();
       check.setLayout(new GridLayout(4,1));
       c1 = new JCheckBox("São paulo");
       check.add(c1);
       c2 = new JCheckBox("Corinthians");
       check.add(c2);
       c3 = new JCheckBox("Flamengo");
       check.add(c3);
       c4 = new JCheckBox("Palmeiras");
       check.add(c4);
       add(check);
       setVisible(true);
       c1.addActionListener(e ->{if(c1.isSelected()) {
           JOptionPane.showMessageDialog(null, "ixi kkkkkkkkkkkkkkkk falo nada");
       } else {

       }
       });
       c2.addActionListener(e -> {if(c2.isSelected()){
           JOptionPane.showMessageDialog(null, "talvez voce seja ladrao");
       }else{

       }
       });
       c3.addActionListener(e ->{if(c3.isSelected()){
           JOptionPane.showMessageDialog(null, " UNICA OPÇÃO VALIDA");
       }else{
       }
       });
       c4.addActionListener(e ->{if(c4.isSelected()){
           JOptionPane.showMessageDialog(null, "CLASSE MEDIA RICA");
       }else{
       }
       });
    }


    public static void main(String[] args) {
      new ExCheck();
    }
}
