package ListaDuplaEncadeada;

public class ListaDupla <T>{

    public  No head;
    public  No tail;
    public int size;

    public void add(T elemento){
        No novo = new No<>(elemento);
        if(head == null){
            head = novo;
            tail = novo;
            size++;
        }
        else {
            No aux = head;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
            novo.setAnterior(aux);
            tail = novo;
            size++;
    //está errado
        }
    }

    @Override
    public String toString() {
        return "ListaDupla{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
