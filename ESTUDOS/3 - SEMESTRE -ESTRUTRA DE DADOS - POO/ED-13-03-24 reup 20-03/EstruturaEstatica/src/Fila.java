public class Fila<T> extends EstruturaEstatica <T> {
    public Fila(){
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        //this.AumentaCapacidade();
        //this.elementos[this.tamanhos] = elemento;
        //this.tamanho++;
        this.adiciona(elemento); // referencia da classe de herança estrutura estatica
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return  this.elementos[0];
    }

    public T desenfileira(){
        if(this.estaVazia()){
            return null;
        }
        final int pos = 0;

        T elementoaserremovido = this.elementos[pos];
        this.remove(pos);
        return elementoaserremovido;
    }
}
