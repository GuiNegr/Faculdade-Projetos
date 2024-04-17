public class
    No<T> {

    private Object elemento;
    private No<T> proximo;

    public No(Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Object getElemento() {
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

    @Override
    public String toString() {
        return "No{" + "elemento = " + elemento + ", proximo = " + proximo + "}";
    }



}