public class No <T>{ // DEIXANDO GENERICO PARA PODER ATRIBUIR QUALQUER VALOR
    public T dados;
    public No proximo; // endereço do proximo valor

    public No(T dados) {
        this.dados = dados;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
