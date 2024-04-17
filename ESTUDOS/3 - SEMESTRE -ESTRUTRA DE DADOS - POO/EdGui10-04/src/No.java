public class No <T>{
    private Object elemento;
    private No<T> proximo;
    private No <T> anterior;

    public No(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
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

    @Override
    public String toString(){
        return "No {" +"elemento = " +elemento + ", proximo = " +proximo+ "anterior = "+ anterior+ "}";
    }
}
