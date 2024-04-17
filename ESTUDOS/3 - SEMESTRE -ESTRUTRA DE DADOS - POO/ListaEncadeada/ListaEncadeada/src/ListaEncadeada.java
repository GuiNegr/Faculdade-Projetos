public class ListaEncadeada<T> {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(Object elemento) {
        No<T> celula = new No<>(elemento);
        if(this.inicio == null && this.fim == null) {
            this.inicio = celula;
        } else {
            this.fim.setProximo(celula);
        }
        this.fim = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{"+inicio+'}';
    }

}