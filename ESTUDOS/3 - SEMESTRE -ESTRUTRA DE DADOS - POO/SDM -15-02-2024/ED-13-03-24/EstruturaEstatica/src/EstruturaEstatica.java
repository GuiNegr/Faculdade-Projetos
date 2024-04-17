public class EstruturaEstatica<T> {// esse t significa dados generico, dados genericos são criados primeiros e instanciados o tipo depois na chamada da criação do objeto
    public T[] elementos;
    public int quatidade;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // por o dado ser generico utiliza o cast para object já que não tem o tipo definido
        this.quatidade = 0; // isso e a quantidade de itens no meu array
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        this.AumentaCapacidade();
        if (this.quatidade < this.elementos.length) {
            this.elementos[this.quatidade] = elemento;
            this.quatidade++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < quatidade)) {
            throw new IllegalArgumentException("POSIÇÃO INVALIDA AMIGÃO");
        }
        this.AumentaCapacidade();
        for (int i = this.quatidade - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.quatidade++;
        return true;
    }

    public void AumentaCapacidade() {
        if (this.quatidade == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.quatidade;
    }

    @Override
    public String toString() { // quando a classe ToString ESTÁ NO SEU CODIGO, O JAVA JA ENTENDE QUE AO EXIBIR OQUE TEM NO ARRAY COMO STRING
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.quatidade - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.quatidade > 0) {
            s.append(this.elementos[this.quatidade - 1]);
        }
        s.append("]");
        return s.toString();
    }

    public Boolean estaVazia() {
        return this.quatidade == 0;
    }
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < quatidade)){
            throw new IllegalArgumentException("POSIÇÃO INVALIDA AMIGAO");
        }
        for(int i = posicao; i < quatidade - 1; i++){
            elementos[i] = elementos[i + 1];
        }
        quatidade--;
    }
}
