import java.io.FileInputStream;
import java.sql.Blob;

public class Foto {
    private FileInputStream fis;
    private int tamanho;

    public Foto(FileInputStream fis, int tamanho) {
        this.fis = fis;
        this.tamanho = tamanho;
    }

    public FileInputStream getFis() {
        return fis;
    }

    public void setFis(FileInputStream fis) {
        this.fis = fis;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
