import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
public class JmenuEx extends  JFrame {
    public JmenuEx(){
        setTitle("JmenuEx");
        setSize(150,150);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu arquivo = new JMenu("ARQUIVO");
        JMenu salvar = new JMenu("EDITAR");
        JMenu exivir = new JMenu("EXIBIR");
        menuBar.add(arquivo);
        menuBar.add(salvar);
        menuBar.add(exivir);
        JMenuItem novo = new JMenuItem("New");
        JMenuItem abrir = new JMenuItem("Open");
        JMenuItem sair = new JMenuItem("Exit");
        JMenuItem cutAction = new JMenuItem("Cut");
        JMenuItem copyAction = new JMenuItem("Copy");
        JMenuItem pasteAction = new JMenuItem("Paste");
        arquivo.add(novo);
        arquivo.add(abrir);
        arquivo.addSeparator();
        arquivo.add(sair);
        salvar.add(cutAction);
        salvar.add(copyAction);
        salvar.add(pasteAction);
    }
}
