
public class ListaDuplamenteEncadeadaCircular<T> {

    private final No<T> cabeca;
    private int tamanho;

    public ListaDuplamenteEncadeadaCircular() {
        cabeca = new No<>(null);
        cabeca.proximo = cabeca;
        cabeca.anterior = cabeca;
        tamanho = 0;
    }

    // Métodos de acesso

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T obterPrimeiro() {
        if (estaVazia()) {
            return null;
        }
        return cabeca.proximo.dado;
    }

    public T obterUltimo() {
        if (estaVazia()) {
            return null;
        }
        return cabeca.anterior.dado;
    }

    // Métodos de manipulação

    public void adicionarInicio(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.proximo = cabeca.proximo;
        novoNo.anterior = cabeca;
        cabeca.proximo.anterior = novoNo;
        cabeca.proximo = novoNo;
        tamanho++;
    }

    public void adicionarFim(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.proximo = cabeca;
        novoNo.anterior = cabeca.anterior;
        cabeca.anterior.proximo = novoNo;
        cabeca.anterior = novoNo;
        tamanho++;
    }

    public void removerInicio() {
        if (estaVazia()) {
            return;
        }
        No<T> primeiro = cabeca.proximo;
        primeiro.proximo.anterior = cabeca;
        cabeca.proximo = primeiro.proximo;
        primeiro.proximo = null;
        primeiro.anterior = null;
        tamanho--;
    }

    public void removerFim() {
        if (estaVazia()) {
            return;
        }
        No<T> ultimo = cabeca.anterior;
        ultimo.anterior.proximo = cabeca;
        cabeca.anterior = ultimo.anterior;
        ultimo.proximo = null;
        ultimo.anterior = null;
        tamanho--;
    }

    // Métodos de busca

    public boolean contem(T dado) {
        No<T> atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.dado.equals(dado)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public int obterIndice(T dado) {
        int indice = 0;
        No<T> atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.dado.equals(dado)) {
                return indice;
            }
            indice++;
            atual = atual.proximo;
        }
        return -1;
    }

    // Métodos de iteração

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No<T> atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirReverso() {
        if (estaVazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No<T> atual = cabeca.anterior;
        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    private class No<T> {

        private T dado;
        private No<T> proximo;
        private No<T> anterior;

        public No(T dado) {
            this.dado = dado;
        }

        public T getDado() {
            return dado;
        }

        public void setDado(T dado) {
            this.dado = dado;
        }

        public No<T> getProximo() {
            return proximo;
        }

        public void setProximo(No<T> proximo) {
            this.proximo = proximo;
        }

        public No<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(No<T> anterior) {
            this.anterior = anterior;
        }
    }


    //atividade P1
    public void addIndice(int pos, T dado) {
        if (estaVazia()) {
            System.out.println("não há posições");
        } else {
            No<T> novoNo = new No<>(dado);
            No<T> aux = cabeca;
            for (int i = 0; i < pos; i++) {
                aux = aux.getProximo();
            }
            novoNo.setProximo(aux.getProximo());
            novoNo.setAnterior(aux);
            aux.getProximo().setAnterior(novoNo);
            aux.setProximo(novoNo);
            tamanho++;
        }
    }

    public void Removeindice(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida");
            return;
        }
        No<T> aux = cabeca.getProximo();
        for (int i = 0; i < pos; i++) {
            aux = aux.getProximo();
        }
        aux.getAnterior().setProximo(aux.getProximo());
        aux.getProximo().setAnterior(aux.getAnterior());
        aux.setAnterior(null);
        aux.setProximo(null);
        tamanho--;
    }

    public String obterIndice(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida");
            return null;
        }
        No<T> aux = cabeca.getProximo();
        for (int i = 0; i < pos; i++) {
            aux = aux.getProximo();
        }
        return aux.getDado().toString();
    }



    public void limpar() {
            cabeca.setAnterior(null);
            cabeca.setProximo(null);
            tamanho = 0;
            System.out.println("não há mais valor");
        }

}


