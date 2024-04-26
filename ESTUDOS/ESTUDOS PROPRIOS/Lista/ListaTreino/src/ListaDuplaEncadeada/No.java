package ListaDuplaEncadeada;

public class No <T>{
    public T dados;
    public No proximo;
    public No anterior;

    public No(T dados) {
        this.dados = dados;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
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



    @Override
    public String toString() {
        String prev = anterior != null ? anterior.getDados().toString() : "null";
        String next = proximo != null ? proximo.getDados().toString() : "null";
        return "No{" +
                "dados=" + dados +
                ", anterior=" + prev +
                ", proximo=" + next +
                '}';
    }
}
