import java.util.Arrays;

public class Fila <T>{
    public T[] fila;
    public int qtdfila;

    public Fila() {
        this.fila = (T[]) new Object[1];
        this.qtdfila = 0;
    }

    public T[] getFila() {
        return fila;
    }

    public void setFila(T[] fila) {
        this.fila = fila;
    }

    public int getQtdfila() {
        return qtdfila;
    }

    public void setQtdfila(int qtdfila) {
        this.qtdfila = qtdfila;
    }

    public void aumenta(){
        if(qtdfila == fila.length){
            T[] novo = (T[]) new Object[fila.length + 1];
            for (int i = 0; i < fila.length ; i++) {
                novo[i] = fila[i];
            }
            this.fila = novo;
        }
    }
    public void adiciona(T elemento){
        if (qtdfila == fila.length){
            aumenta();
        }
        if(qtdfila > 0){
            for (int i = 0; i < fila.length; i++) {
                if(fila[i] == null){
                    fila[i] = elemento;
                }
            }
            qtdfila++;
        }
        else {
            fila[0]  = elemento;
            qtdfila++;
        }
    }

    @Override
    public String toString() {
        return "Fila{" +
                "fila=" + Arrays.toString(fila) +
                ", qtdfila=" + qtdfila +
                '}';
    }
    public void remover() throws IllegalAccessError{
        if (qtdfila == 0){
            throw new IllegalAccessError("Não há elementos para remover na pilha.");
        }
        for (int i =0; i < fila.length - 1; i++) {
            int j = i + 1;
            fila[i] = fila[j];
        }
        fila[fila.length - 1] = null;
        this.qtdfila--;
    }
}
